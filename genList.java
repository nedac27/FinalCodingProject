package FinalCodingProject;
import java.util.*;
import java.io.*;
public class genList {


    public static List<Car> run(String filepath) throws FileNotFoundException{
        Scanner s = new Scanner(new File(filepath));
        List<Car> cars = new ArrayList<Car>();
        s.nextLine();
        while(s.hasNext()){
            cars.add(createCar(s.nextLine().split(",")));
        }
        return cars;
    }


    private static Car createCar(String[] temp){
        String brand = temp[0];
        String name = temp[1];
        Type type = genType(temp[2]);
        double price = Double.valueOf(temp[3]);
        int doors = Integer.valueOf(temp[4]);
        int seats = Integer.valueOf(temp[5]);
        double mpg = Double.valueOf(temp[6]);
        double fuelCap = Double.valueOf(temp[7]);
        double range = Double.valueOf(temp[8]);
        double storeage = Double.valueOf(temp[9]);
        Drivetrain drivetrain = genDrivetrain(temp[10]);
        int cylindarCount = Integer.valueOf(temp[11]);
        int horsePower = Integer.valueOf(temp[12]);
        int tourque = Integer.valueOf(temp[13]);
        int topSpeed = Integer.valueOf(temp[14]);
        Fuel fuel = genFule(temp[15]);
        return new Car(brand, name, type, price, doors, seats, mpg, fuelCap, range, storeage, drivetrain, cylindarCount, horsePower, tourque, topSpeed, fuel);
    }

    private static Type genType(String x){
        switch (x) {
            case "sports":
                return Type.SPORTS;
            case "convertable":
                return Type.CONVERTABLE;
            case "coupe":
                return Type.COUPE;
            case "hatchback":
                return Type.HATCHBACK;
            case "sedan":
                return Type.SEDAN;
            case "wagon":
                return Type.WAGON;
            case "suv":
                return Type.SUV;
            case "truck":
                return Type.TRUCK;
            case "minivan":
                return Type.MINIVAN;
            default:
                return Type.SEDAN;
        }
    }
    private static Drivetrain genDrivetrain(String x){
        switch (x) {
            case "AWD":
                return Drivetrain.AWD;
            case "FWD":
                return Drivetrain.FWD;
            default:
                return Drivetrain.RWD;
        }
    }
    private static Fuel genFule(String x){
        switch (x) {
            case "LOWOCTANE":
                return Fuel.LOWOCTANE;
            case "AVERAGEOCTANE":
                return Fuel.AVERAGEOCTANE;
            default:
                return Fuel.HIGHOCTANE;
        }
    }
}

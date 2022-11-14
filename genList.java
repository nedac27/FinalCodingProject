package FinalCodingProject;
import java.util.*;
import java.io.*;
public class genList {
    private Scanner s;
    private List<Car> cars;

    public genList(String filePath) throws FileNotFoundException{
        this.s = new Scanner(new File(filePath));
        String[] temp = {};
        temp = this.s.nextLine().split(",");
        String brand = temp[0];
        String name = temp[1];
        Type type = genType(temp[2]);
        double mpg = Double.valueOf(temp[3]);
        double price = Double.valueOf(temp[4]);
        double range = Double.valueOf(temp[5]);
        double tankSize = Double.valueOf(temp[6]);
        int doors = Integer.valueOf(temp[7]);
        int cylindarCount = Integer.valueOf(temp[8]);
        int horsePower = Integer.valueOf(temp[9]);
        int tourque = Integer.valueOf(temp[10]);
        
    }

    private Type genType(String x){
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

}

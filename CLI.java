package FinalCodingProject;
import java.io.FileNotFoundException;
import java.util.*;
public class CLI {
    
    private Scanner s;
    private List<Car> cars;
    
    public CLI()throws FileNotFoundException{
        this.s = new Scanner(System.in);

        this.cars = genList.run("C:/csec/FinalCodingProject/eat.csv");
        System.out.println(cars);

    }

    public static void main(String[] args) throws FileNotFoundException {
        CLI meme = new CLI();
    }
}

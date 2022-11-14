package FinalCodingProject;
import java.util.List;
import java.util.ArrayList;
public class compare {
    private List<Car> cars;
    private List<String> catagorys;
    private List<Car> ranking;
    
    public compare(List<Car> cars, List<String> catagorys){
        this.cars = cars;
        this.catagorys = catagorys;
        this.ranking = new ArrayList<Car>();
        run();
    }

    private void run(){
        for (String s : catagorys){
            switch (s) {
                case "":
                    
                    break;
            
                default:
                    break;
            }
        }
    }

}

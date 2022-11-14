package FinalCodingProject;

public enum Type {
    
    SPORTS(1, "sports"),
    CONVERTABLE(2, "convertable"),
    COUPE(3, "coupe"),
    HATCHBACK(4, "hatchback"),
    SEDAN(5, "sedan"),
    WAGON(6, "wagon"),
    SUV(7, "suv"),
    TRUCK(8, "truck"),
    MINIVAN(9, "minivan");

    private final int size;
    private final String name;

    Type(int size, String name){
        this.size = size;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public int getSize(){
        return this.size;
    }
    
    @Override
    public String toString(){
        return this.name;
    }

}

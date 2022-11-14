package FinalCodingProject;

public enum Fuel {
    
    LOWOCTANE(3, "low octane"),
    AVERAGEOCTANE(2, "average octane"),
    HIGHOCTANE(1, "high octane");

    private final int rank;
    private final String name;
    Fuel(int rank, String name){
        this.rank = rank;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getRank(){
        return this.rank;
    }
    @Override
    public String toString(){
        return this.name;
    }
}

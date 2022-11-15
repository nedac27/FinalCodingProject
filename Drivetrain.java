package FinalCodingProject;

public enum Drivetrain {
    
    AWD(3, "AWD"),
    FWD(2, "FWD"),
    RWD(1,"RWD");

    private final int rank;
    private final String name;
    Drivetrain(int rank, String name){
        this.rank = rank;
        this.name = name;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the rank
     */
    public int getRank() {
        return rank;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }
}

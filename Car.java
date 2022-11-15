package FinalCodingProject;

// uh oh...

public class Car {
    
    private String brand;
    private String name;
    private Type type;
    private double price;
    private int doors;
    private int seats;
    private double mpg;
    private double fuelCap;
    private double range;
    private Drivetrain dirvetrain;
    private int cylindarCount;
    private int horsePower;
    private int tourque;
    private int topSpeed;
    private Fuel fuel;

    public Car(String brand, String name, Type type, double price, int doors, int seats, double mpg, double fuelCap, double range, double storeage, Drivetrain drivetrain, int cylindarCount, int horsePower, int tourque, int topSpeed, Fuel fuel){
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.price = price;
        this.doors = doors;
        this.seats = seats;
        this.mpg = mpg;
        this.fuelCap = fuelCap;
        this.range = range;
        this.dirvetrain = drivetrain;
        this.cylindarCount = cylindarCount;
        this.horsePower = horsePower;
        this.tourque = tourque;
        this.topSpeed = topSpeed;
        this.fuel = fuel;
    }


   /**
    * @return the brand
    */
   public String getBrand() {
       return this.brand;
   }
   /**
    * @return the name
    */
   public String getName() {
       return this.name;
   }
   /**
    * @return the type
    */
   public Type getType() {
       return this.type;
   }
   /**
    * @return the mpg
    */
   public double getMpg() {
       return this.mpg;
   }
   /**
    * @return the price
    */
   public double getPrice() {
       return this.price;
   }
   /**
    * @return the range
    */
   public double getRange() {
       return this.range;
   }
   /**
    * @return the FuelCap
    */
   public double getFuelCap() {
       return this.fuelCap;
   }
   /**
    * @return the cylindarCount
    */
   public int getCylindarCount() {
       return this.cylindarCount;
   }
   /**
    * @return the doors
    */
   public int getDoors() {
       return this.doors;
   }
   /**
    * @return the horsePower
    */
   public int getHorsePower() {
       return this.horsePower;
   }/**
    * @return the tourque
    */
   public int getTourque() {
       return this.tourque;
   }
   /**
    * @return the seats
    */
   public int getSeats() {
       return this.seats;
   }
   /**
    * @return the dirvetrain
    */
   public Drivetrain getDirvetrain() {
       return dirvetrain;
   }
   /**
    * @return the fuel
    */
   public Fuel getFuel() {
       return fuel;
   }
   /**
    * @return the topSpeed
    */
   public int getTopSpeed() {
       return topSpeed;
   }
   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return ("brand: "+ this.brand+": name: "+ this.name + ": price: "+ this.price);
   }
}

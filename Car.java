package FinalCodingProject;

public class Car {
    
    private String name, brand;
    private Type type;
    private double price, mpg, range, tankSize;
    private int horsePower, tourque, doors, cylindarCount;

    public Car(String brand, String name, Type type, int price, int horsePower, int tourque, int cylindarCount, int doors, double mpg, Fuel fuel, double tankSize, double range ){
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.mpg = mpg;
        this.price = price;
        this.range = range;
        this.tankSize = tankSize;
        this.cylindarCount = cylindarCount;
        this.doors = doors;
        this.horsePower = horsePower;
        this.tourque = tourque;
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
    * @return the tankSize
    */
   public double getTankSize() {
       return this.tankSize;
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
}

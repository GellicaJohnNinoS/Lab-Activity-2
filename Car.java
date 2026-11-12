public class Car extends Vehicle implements Serviceable {
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors){
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors > 0)
        {
            this.numberOfDoors = numberOfDoors;
        }
    }

    @Override
    public void moveForward() {
        System.out.println("A car moves forward ");
    }

    @Override
    public void moveBackward() {
        System.out.println("A car moves backward ");
    }

    @Override
    public void moveLeft() {
        System.out.println("A car moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("A car moves right");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
    @Override
   public void service() {
    System.out.println("Car is being serviced.");
   }

   @Override
   public boolean needsService() {
    return true;
   }
}
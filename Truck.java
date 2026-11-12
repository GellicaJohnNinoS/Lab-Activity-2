public class Truck extends Vehicle implements Serviceable {
    private int numberOfWheels;

    public Truck(String brand, String model, int year, int numberOfWheels) {
        super(brand, model, year);
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        if (numberOfWheels > 0) {
            this.numberOfWheels = numberOfWheels;
        }
    }

    @Override
    public void moveForward() {
        System.out.println("A truck moves forward.");
    }

    @Override
    public void moveBackward() {
        System.out.println("A truck moves backward.");
    }

    @Override
    public void moveLeft() {
        System.out.println("A truck moves left.");
    }

    @Override
    public void moveRight() {
        System.out.println("A truck moves right.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Wheels: " + numberOfWheels);
    }
    @Override
   public void performService() {
    System.out.println("Truck is being serviced.");
    }

    @Override
    public boolean needsService() {
    return true;
   }
}
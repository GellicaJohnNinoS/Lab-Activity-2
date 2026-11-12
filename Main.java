public class Main {

   public static void serviceItem(Serviceable item) {
    item.performService();

    System.out.println("Needs Service: " + item.needsService());
    }

    public static void printDetails(Vehicle vehicle){
        vehicle.displayInfo();
        
        System.out.println("Age: " + vehicle.calculateAge());
        System.out.println("Vintage: " + vehicle.isVintage());
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Car("Honda", "Civic", 2023, 4);
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Motorcycle("Kawasaki", "Ninja", 2015, "Manual");
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Truck("Ford", "F-150 Lightning", 1957, 4);
        vehicle.displayInfo();
        System.out.println();

        System.out.println("\n--- 2. Method Parameter ---");
        Car car = new Car("Porsche", "Carrera GTS", 1965, 2);
        Motorcycle motor = new Motorcycle("BMW", "F 450 GS", 2006, "Automatic");
        Truck truck = new Truck("Toyota", "Tacoma", 2024, 6);

        printDetails(car);
        System.out.println();

        printDetails(motor);
        System.out.println();

        printDetails(truck);
        System.out.println();

        System.out.println("\n--- 3. Polymorphic Array ---");

        Vehicle[] vehicles = {
            new Car("Mazda", "Miata", 2017, 2),
            new Motorcycle("Ducati", "Panigale V4 S", 2022, "Manual"),
            new Truck("Rivian", "R1T", 2020, 6)
        };

        for(Vehicle currentVehicle : vehicles){
            printDetails(currentVehicle);
            System.out.println();
        }
        
        System.out.println("\n--- 4. Interface Polymorphism ---");

        Serviceable[] serviceItems = {
            new Car("Honda", "Civic", 2023, 4),
            new Motorcycle("Kawasaki", "Ninja", 2015, "Manual"),
            new Truck("Ford", "F-150", 2020, 6),
            new Printer()
         };

         for (Serviceable item : serviceItems) {
            serviceItem(item);
            System.out.println();
        }
    }
}
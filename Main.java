
public class Main {
    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Car("Ferrari", "Spyder Ferrari", 2020, 4);
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Motorcycle("Kawasaki", "Ninja 650", 2015, "Manual");
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Truck("Ford", "F-150 SuperCrew", 1957, 4);
        vehicle.displayInfo();
        System.out.println();

        System.out.println("\n--- 2. Method Parameter ---");

        Car car = new Car("Ford", "Mustang", 1965, 2);
        Motorcycle motor = new Motorcycle("Honda", "Click", 2006, "Automatic");
        Truck truck = new Truck("Ford", "F-150", 2023, 6);

        printDetails(car);
        System.out.println();

        printDetails(motor);
        System.out.println();

        printDetails(truck);
        System.out.println();

        System.out.println("\n--- 3. Polymorphic Array ---");

        Vehicle[] vehicles = {
            new Car("Toyota", "Supra", 2022, 2),
            new Motorcycle("Yamaha", "MT-07", 2023, "Manual"),
            new Truck("Chevrolet", "Silverado 1500 Crew Cab", 2022, 4)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            System.out.println();
        }
    }
}

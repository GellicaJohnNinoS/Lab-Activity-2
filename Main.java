public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();

        vehicle1.brand = "Porsche";
        vehicle1.model = "911 GT3 RS";
        vehicle1.year = 2023;

        Vehicle vehicle2 = new Vehicle();

        vehicle2.brand = "Ferrari";
        vehicle2.model = "250 GTO";
        vehicle2.year = 1929;

        Vehicle vehicle3 = new Vehicle();

        vehicle3.brand = "Tesla";
        vehicle3.model = "Model 3 Highland";
        vehicle3.year = 2024;

        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
    }
}
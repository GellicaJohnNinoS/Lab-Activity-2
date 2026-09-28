public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("La Ferrari", "Spyder Ferrari", 2023);

        Vehicle v2 = new Vehicle("Tesla", "Underwater Tesla", 2021);


        Vehicle v3 = new Vehicle("Koenigsegg", "Geokoen", 1978);


        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());

        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());

        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());
    }
}
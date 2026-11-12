public class Printer implements Serviceable {

    @Override
    public void service() {
        System.out.println("Printer is being serviced.");
    }

    @Override
    public boolean needsService() {
        return true;
    }
}

public class Printer implements Serviceable {

    @Override
    public void performService() {
        System.out.println("Printer is being serviced.");
    }

    @Override
    public boolean needsService() {
        return true;
    }
}

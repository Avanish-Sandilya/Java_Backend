public class Jet implements FlightEnabled,Trackable{

    @Override
    public void takeOff() {
        System.out.println("Engines started and took off");
    }

    @Override
    public void fly() {
        System.out.println("In flight");
    }

    @Override
    public void land() {
        System.out.println("Touch down successful");
    }

    @Override
    public void track() {
        System.out.println("Coordinates recorded");
    }
}

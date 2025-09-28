public class Bird extends Animal{

    @Override
    void move() {
        System.out.println("Bird flies");
    }

    @Override
    public void takeOff() {
        System.out.println("Flaps wings");
    }

    @Override
    public void fly() {
        System.out.println("In flight");
    }
    @Override
    public void land() {
        System.out.println("Sat on a tree");

    }

    @Override
    public void track() {
        System.out.println("Coordinates recorded");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird= new Bird();
        bird.move();
        bird.fly();
        bird.land();
        Jet jet = new Jet();
        jet.takeOff();
        jet.fly();
        jet.land();
    }
}

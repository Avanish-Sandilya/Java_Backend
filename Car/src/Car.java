public class Car {
    // write code here
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders,String name){
        this.cylinders=cylinders;
        this.name=name;
        this.engine=true;
        this.wheels=4;
    }

    public String startEngine(){
        return "Car's engine is starting";
    }

    public String accelerate(){
        return "Car is accelerating";
    }

    public String brake(){
        return "Car is braking";
    }

    public int getCylinders(){
        return this.cylinders;
    }

    public String getName(){
        return this.name;
    }


}
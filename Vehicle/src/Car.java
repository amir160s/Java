public class Car extends Vehicle{
    public Car()
    {
        System.out.println("Car Constructor");
    }
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

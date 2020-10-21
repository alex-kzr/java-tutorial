public class Car extends Vehicle {
    int numOfSeats = 5;

    @Override
    public void drive(){
        super.drive();
        System.out.println("... and accelerate to x 1.5 times");
    }
}

public class Main {
    public static void main(String[] args){
        Vehicle someVehicle = new Vehicle();
        Vehicle toyota = new Car();

        System.out.println(someVehicle.getMaxSpeed());
        System.out.println(toyota.getMaxSpeed());
    }
}

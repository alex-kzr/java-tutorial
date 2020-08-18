public class Main {

    int i; // init with 0
    boolean bool; // init with false
    Car car; // init with null


    public static void main(String[] args){
        int j; // compile error if we try read j
        Car car2 = new Car();
        System.out.println(car2.maxSpeed);
        System.out.println(car2.main);
    }
}

class Car {
    int maxSpeed;
    Main main;
}
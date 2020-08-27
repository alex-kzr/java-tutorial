public class Main {

    int i; // init with 0
    boolean bool; // init with false
    Car car; // init with null
    int y = 5, x, z; // init in one line


    public static void main(String[] args){
        int j; // compile error if we try read j
        int y = 3; // will be used another y var on method level
        Car car2 = new Car();
        System.out.println(car2.maxSpeed);
        System.out.println(car2.main);
    }
}

class Car {
    int maxSpeed;
    Main main;

    public static final String TEXT_ID = "123";

    private final String name;

    public Car(String name) {
        this.name = name;
    }

//    private void test() {
//        name = "new name"; // compile error
//    }
}
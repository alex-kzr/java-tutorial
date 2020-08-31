public class Main {
    public static void main(String[] args){

        Car car1 = new Car("BMW");
        Main.test1(car1);
        System.out.println("car1.getName = " + car1.getName()); // Toyota
        
        int i = 2;
        Main.test2(i);
        System.out.println("i = " + i); // 2

        Car car2 = new Car("Mercedes-Benz");
        Main.test3(car2);
        System.out.println("car2.getName = " + car2.getName()); // Mercedes-Benz

        Car car3 = new Car();
        Main.test4(car1, car2, car3);
    }

    public static void test1(Car car) {
        car.setName("Toyota");
    }

    public static void test2(int i) {
        i = 6;
    }

    public static void test3(Car car) {
        car = new Car("Niva");
        test5(car);
    }

    public static void test4(Car... cars) {
        System.out.println("cars.length = " + cars.length);
    }

    public static void test5(Car car) {
        car = new Car("KIA");
    }
}

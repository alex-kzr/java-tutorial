public class Main {
    public static void main(String[] args){

        Car car1 = new Car();
        car1.setName("BMW");

        Car car2 = new Car();
        car2.setName("BMW");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car1.equals(car2)); // true
    }
}

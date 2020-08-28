public class Main {
    public static void main(String[] args){

        Car c1 = new Car();
        Car c2 = c1;

//        c1.setName("BMW");
//        System.out.println("c2.getName() = " + c2.getName());
//
//        c2.setName("Toyota");
//        System.out.println("c1.getName() = " + c1.getName() );

        System.out.println("c1.getName() = " + c1.getName());
        System.out.println("c1.getName() = " + c1.getName().length()); // java.lang.NullPointerException

        c1 = null;

        System.out.println("c1 = " c1.getName()); // java.lang.NullPointerException

    }
}

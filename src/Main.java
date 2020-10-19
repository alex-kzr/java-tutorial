import java.util.*;

public class Main {

    public static void main(String[] args){
        example();
    }

    public static void example(){

        //hashSetExample();

        //treeSetExample();

        linkedHashSetExample();
    }

    public static void hashSetExample(){

        Set cars = new HashSet();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan"); // duplicate

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Iterator iterator = cars.iterator();

        while (iterator.hasNext()){
            Car car = (Car) iterator.next();
            System.out.println(car.getName());
        }
    }

    public static void treeSetExample(){

        TreeSet tree = new TreeSet();

        tree.add(34);
        tree.add(21);
        tree.add(67);
        tree.add(23);
        tree.add(676);
        tree.add(453);
        tree.add(23);

        Iterator iterator = tree.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    public static void linkedHashSetExample(){

        LinkedHashSet set = new LinkedHashSet();

        set.add(34);
        set.add(334);
        set.add(123);
        set.add(546);
        set.add(162);
        set.add(565);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){

        // arrayListExamples();

        linkedListExamples();
    }

    public static void arrayListExamples(){

        ArrayList<Car> cars = new ArrayList();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4); // allowed to add duplicates

        cars.add(new Car("Toyota"));

        System.out.println("cars.size() = " + cars.size()); // list size

        System.out.println("cars.contains(car2) = " + cars.contains(car2)); // Is list contains defined item

        int index = cars.indexOf(car3);
        System.out.println("index = " + index); // get index from zero

        Car selectedCar = cars.get(3);
        System.out.println("selectedCar = " + selectedCar.getName());

        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        cars.clear(); // clear list
        System.out.println("cars.isEmpty() = " + cars.isEmpty());

        selectedCar = cars.get(3); // IndexOutOfBoundsException
    }

    public static void linkedListExamples(){

        LinkedList<Car> cars = new LinkedList();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Toyota");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        cars.addLast(car1);

        Iterator<Car> iterator = cars.descendingIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
}

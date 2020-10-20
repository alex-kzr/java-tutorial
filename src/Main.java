import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args){

        Queue<Car> cars = new ArrayBlockingQueue<>(5); // items limit

        Car car1 = new Car("Nissan");
        Car car2 = new Car("BMW");
        Car car3 = new Car("Toyota");
        Car car4 = new Car("KIA");
        Car car5 = new Car("Niva");
        Car car6 = new Car("Lexus");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        // cars.add(car6); // with limited ArrayBlockingQueue IllegalStateException: Queue full

        System.out.println(cars.element()); // get first element without deleting element
        System.out.println(cars.remove()); // get first element with deleting element

        Deque<Car> carsDeque = new ArrayDeque<>();

        carsDeque.add(car1);
        carsDeque.add(car2);
        carsDeque.add(car3);
        carsDeque.add(car4);
        carsDeque.add(car5);

        System.out.println(carsDeque.removeFirst()); // get first element with deleting element
        System.out.println(carsDeque.removeLast()); // get last element with deleting element


        Queue lifoQueue = Collections.asLifoQueue(carsDeque);
        System.out.println(cars.element()); // get first element without deleting element
        System.out.println(cars.remove()); // get first element with deleting element

        Stack stack = new Stack();
        stack.add(car1);
        stack.add(car2);
        stack.add(car3);
        stack.add(car4);
        stack.add(car5);
        stack.add(car6);

        System.out.println(stack.peek()); // get first element without deleting element
        System.out.println(stack.pop()); // get first element with deleting element
    }
}

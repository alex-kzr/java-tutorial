public class Main {
    public static void main(String[] args){
        CarFactory carFactory = new CarFactory();

        Car toyota = (Car) carFactory.create("Toyota");
        Car audi = (Car) carFactory.create("Audi");
        Car noname = (Car) carFactory.create("noname");
        toyota.drive();
        audi.drive();
    }
}

interface Car {
    void drive();
}

class Toyota implements Car {

    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}

class Audi implements Car {

    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}

interface Factory<Type> {
    Type create(String typeofProduct);
}

class CarFactory<Car> {
    public Car create(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota" : return (Car) new Toyota();
            case "Audi" : return (Car) new Audi();
        }

        throw new RuntimeException("Factory " + typeOfCar + " not identified ");
    }
}
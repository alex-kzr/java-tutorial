public class Main {
    public static void main(String[] args){
        CarCreator carCreator = new CarCreator();

        Car toyota = (Car) carCreator.create("Toyota");
        Car audi = (Car) carCreator.create("Audi");
        Car noname = (Car) carCreator.create("noname");
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

interface Creator<Type> {
    Type create(String typeofProduct);
}

class CarCreator<Car> {
    public Car create(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota" : return (Car) new Toyota();
            case "Audi" : return (Car) new Audi();
        }

        throw new RuntimeException("Factory " + typeOfCar + " not identified ");
    }
}
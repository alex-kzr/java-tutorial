
public class Main {
    public static void main(String[] args){

        Director director = new Director();
        director.setCarBuilder(new HondaCivicBuilder());
        Car car = director.buildCar();

        System.out.println(car);
    }
}

class Car {
    String brand;
    Transmission transmission;
    int maxSpeed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

enum Transmission {
    MANUAL, AUTO
}

abstract class CarBuilder {
    Car car;
    void createCar() {
        this.car = new Car();
    }

    abstract void buildBrand();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar(){
        return car;
    }
}

class NissanMarchBuilder extends CarBuilder {

    void buildBrand() {
        car.setBrand("Nissan March");
    }

    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(183);
    }
}

class HondaCivicBuilder extends CarBuilder {

    void buildBrand() {
        car.setBrand("Honda Civic");
    }

    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(270);
    }
}

class Director {
    CarBuilder carBuilder;
    void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    Car buildCar() {
        carBuilder.createCar();

        carBuilder.buildBrand();
        carBuilder.buildTransmission();
        carBuilder.buildMaxSpeed();
        Car car = carBuilder.getCar();
        return car;
    }
}
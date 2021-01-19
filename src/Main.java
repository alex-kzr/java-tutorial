import javax.xml.bind.annotation.XmlType;

public class Main {
    public static void main(String[] args){
        Car car = new CarBuilder()
                .buildBrand("Mercedes-Benz")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(255)
                .build();

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

class CarBuilder {
    static final String DEFAULT_BRAND = "Noname";
    static final Transmission DEFAULT_TRANSMISSION = Transmission.AUTO;
    static final int DEFAULT_MAX_SPEED = 160;

    String brand = DEFAULT_BRAND;
    Transmission transmission = DEFAULT_TRANSMISSION;
    int maxSpeed = DEFAULT_MAX_SPEED;

    CarBuilder buildBrand(String brand) {
        this.brand = brand;
        return this;
    }

    CarBuilder buildTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    CarBuilder buildMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    Car build() {
        Car car = new Car();

        car.setBrand(brand);
        car.setTransmission(transmission);
        car.setMaxSpeed(maxSpeed);

        return car;
    }
}
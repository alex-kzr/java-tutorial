public class HelloWorld {

    // Primitive types
    byte b = 1;       //1 byte(256) from -128 to 127
    short s = 129;      //2 bytes(6,5536) -32,768 to 32,767
    int i = 646554;        //4 bytes(4,294,967,296) from -2,147,483,648 to 2,147,483,647
    long l = 465535464;       //8 bytes(a lot) from -2^63 to 2^63-1
    float f = 12.5778f;      //4 bytes. Sufficient for storing 6 to 7 decimal digits
    double d = 3.78080808723;     //8 bytes. Sufficient for storing 15 decimal digits
    boolean bool = true;
    char c = 'c';

    // Non-primitive types
    Car car = new Car(); // object type

    public static void main(String[] args){

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.car.maxSpeed = 100;
        System.out.println(helloWorld.car.maxSpeed);
    }
}

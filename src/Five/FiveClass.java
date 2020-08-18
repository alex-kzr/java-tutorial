package Five;

public class FiveClass {
    final int CONSTANT_VARIABLE = 5; // constant that can't be changed
    final int ANOTHER_CONSTANT;

    public FiveClass(int ANOTHER_CONSTANT) {
        this.ANOTHER_CONSTANT = ANOTHER_CONSTANT; // set constant using constructor
    }

    static int classVariable = 256; // variable for class and if we change it that will affects all instances of a class
}

class SixClass {
    void method() {
        System.out.println(FiveClass.classVariable); // variable for class, and we can use it without instantiating
    }
}
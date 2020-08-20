class ParentClass {
    ParentClass() {
        // super(); this line compiler add by default if skip it and it starts Object constructor
        System.out.println("Parent constructor");
    }
}


public class ExampleClass extends ParentClass {

    // default class constructor
    public ExampleClass() {
        // super(); this line compiler add by default if skip it
        System.out.println("ExampleClass constructor");
    }

    ExampleClass(int i) {
        // will be compile error if we don't have constructor without param in ParentClass
    }
}

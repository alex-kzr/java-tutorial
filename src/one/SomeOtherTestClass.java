package one;

public class SomeOtherTestClass {
    void method() {
        OneClass oneClass = new OneClass();
        System.out.println(oneClass.j + "," + oneClass.k + "," + oneClass.m); // can't access to i (private) var
    }
}

package one;

public class OneClass {
    private int i = 5;
    protected int j = 6;
    int k = 7;
    public int m = 8;
}


class TestModifiers {
    void method() {
        OneClass oneClass = new OneClass();
        System.out.println(oneClass.j + "," + oneClass.k + "," + oneClass.m); // can't access to i (private) var
    }
}
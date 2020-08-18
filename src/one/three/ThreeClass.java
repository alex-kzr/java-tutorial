package one.three;

import one.OneClass;

public class ThreeClass {
    void method() {
        OneClass oneClass = new OneClass();
        System.out.println(oneClass.m); // can't access to i (private), j (protected) and k (default) vars
    }
}

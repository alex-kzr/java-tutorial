package two;

import one.OneClass;

public class TwoClass {
    void method() {
        OneClass oneClass = new OneClass();
        System.out.println(oneClass.m); // can't access to i (private), j (protected) and k (default) vars
    }
}

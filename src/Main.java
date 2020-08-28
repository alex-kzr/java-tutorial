public class Main {
    public static void main(String[] args){
        // method(1, 2.5f, true, new Object(), "hello", 234, 4342, 2424, 353, 131, 262);
        // System.out.println(method2());
        // printString(getNewValue(getString()));
        // printString(returnMethod());
        // recursive(0);
        // System.out.println(returnExample(-10));
        returnExampleVoid(0);
    }

    static void method(int i, float f, boolean b, Object o, String s, int... j) {
        System.out.println(i);
        System.out.println(f);
        System.out.println(b);
        System.out.println(o);
        System.out.println(s);
        for(int k : j) {
            System.out.println(k);
        }
    }

    static Object method2(){
        return new Object();
    }

    public static String  getString() {
        return "new string";
    }

    public static String getNewValue(String string) {
        return string + " add new value!";
    }

    public static void printString(String string) {
        System.out.println("value = " + string);
    }

    public static String returnMethod() {
        return getNewValue("new value");
    }

    public static int recursive (int value) {
        value += 1;
        if (value == 10) {
            return value;
        }
        System.out.println(value);

        return recursive(value);
    }

    public static String returnExample (int count) {
        if (count < 0) {
            return "negative";
        } else {
            return  "positive";
        }
    }

    public static void returnExampleVoid (int count) {
        if (count == 0) {
            return;
        }
        System.out.println(count);
    }
}

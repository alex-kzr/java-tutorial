public class Main {
    public static void main(String[] args){
        method(1, 2.5f, true, new Object(), "hello", 234, 4342, 2424, 353, 131, 262);
        System.out.println(method2());
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
}

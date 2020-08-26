public class ForLoop {
    public static void start1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void start2() {
        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
        }
    }

    public static void start3() {
        for (int i = 0; i < 10; i+=2) {
            System.out.println("i = " + i);
        }
    }

    public static void start4() {
        int i = 0;
        for (; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void start5() {
        for (double k = 0; k < 10; k+=.1) {
            System.out.println("k = " + k);
        }
    }
}

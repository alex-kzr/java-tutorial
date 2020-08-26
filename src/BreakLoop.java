public class BreakLoop {
    public static void start() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            if (i == 5) {
                break;
            }
        }
    }
}

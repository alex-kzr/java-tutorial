public class ContinueLoop {
    public static void start() {
        int i = 0;
        while (i < 10) {
            i++;
            if (i > 5) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}

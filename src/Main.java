import java.io.IOException;

public class Main {

    static int addTwoDigits(int a, int b) throws IOException {
        return a + b;
    }

    static double addTwoDigits(double a, double b) {
        return a + b;
    }

    static int addTwoDigits() throws Exception {
        return 5;
    }

    static boolean addTwoDigits(boolean b) {
        return true;
    }

    public static void main(String[] args){
        //System.out.println(addTwoDigits(1, 2));
        System.out.println(addTwoDigits(1.2, 2.3));
        //System.out.println(addTwoDigits());
        System.out.println(addTwoDigits(false));
        OverloadChild.addTwoDigits(5);

    }
}

class OverloadChild extends Main {
    static void addTwoDigits(int i) {
        System.out.println("overload method");
    }
}
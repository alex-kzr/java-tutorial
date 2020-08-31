public class Main {
    public static void main(String[] args){

        // call both conditions
        if (condition1() & condition2()) {
            System.out.println("ok");
        }

        // call only condition 1 (false) and exit
        if (condition1() && condition2()) {
            System.out.println("ok");
        }

        // call only condition 2 (true) and exit
        if (condition2() || condition1()) {
            System.out.println("ok");
        }

        // call both conditions
        if (condition2() | condition1()) {
            System.out.println("ok");
        }
    }

    public static boolean condition1() {
        System.out.println("condition 1");
        return false;
    }

    public static boolean condition2() {
        System.out.println("condition 2");
        return true;
    }
}

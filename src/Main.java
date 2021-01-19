public class Main {
    public static void main(String[] args){

        final int ARRAY_SIZE = 1000;
        Singleton array[] = new Singleton[ARRAY_SIZE];

        for (int i = 0; i<ARRAY_SIZE; i++) {
            array[i] = Singleton.getInstance();
        }

        System.out.println(Singleton.getCounter());
    }
}

class Singleton {

    private static Singleton instance;

    private static int counter = 0;

    private Singleton(){
        counter++;
    }

    public static Singleton getInstance(){

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public static int getCounter() {
        return counter;
    }
}
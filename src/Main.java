public class Main {
    public static void main(String[] args) throws InterruptedException {

        final int INSTANCES_SIZE = 1000;

        Thread thread[] = new Thread[INSTANCES_SIZE];

        // several thread keep up to create several instances
        for (int i = 0; i < INSTANCES_SIZE; i++) {
            thread[i] = new Thread(new ThreadRunner());
            thread[i].start();
        }
        for (int i = 0; i < INSTANCES_SIZE; i++) {
            thread[i].join();
        }

        System.out.println(Singleton.getCounter());
    }
}

class Singleton {

    // initialization will create instance only once and we dont need to check instance existence in the constructor
    private static Singleton instance = new Singleton();

    private static int counter = 0;

    private Singleton(){
        counter++;
    }

    public static Singleton getInstance(){
        return instance;
    }

    public static int getCounter() {
        return counter;
    }
}

class ThreadRunner implements Runnable {

    @Override
    public void run() {
        Singleton.getInstance();
    }
}
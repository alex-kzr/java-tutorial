interface Executable {
    void execute();
}

class Runner {
    public void run(Executable executable) {
        executable.execute();
    }
}

public class Main {
    public static void main(String[] args){
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Start execute from anonymous interface implementation");
                System.out.println("End execute from anonymous interface implementation");
            }
        });

        runner.run(() -> {
            System.out.println("Start execute from lambda");
            System.out.println("End execute from lambda");
        });
    }
}

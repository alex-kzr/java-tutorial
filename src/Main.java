interface Executable {
    int execute();
}

class Runner {
    public void run(Executable executable) {
        int e = executable.execute();
        System.out.println(e);
    }
}

public class Main {
    public static void main(String[] args){
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute() {
                return 1;
            }
        });

        runner.run(() -> {
            return 10;
        });
    }
}

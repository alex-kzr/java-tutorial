interface Executable {
    int execute(int x);
}

class Runner {
    public void run(Executable executable) {
        int e = executable.execute(100);
        System.out.println(e);
    }
}

public class Main {
    public static void main(String[] args){
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int x) {
                return 1 + x;
            }
        });

        runner.run(x -> 10 + x);
    }
}

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable executable) {
        int e = executable.execute(100, 1000);
        System.out.println(e);
    }
}

public class Main {
    public static void main(String[] args){
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                return x + y;
            }
        });

        runner.run((x, y) -> y - x);
    }
}

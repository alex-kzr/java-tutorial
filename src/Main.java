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

        int a = 1;
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                int a = 2;
                return x + y;
            }
        });

        runner.run((x, y) -> {
            // int a = 3; - error because lambda has same scope as external caller
            int b = 4;
            return y - x;
        });
    }
}

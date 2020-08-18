public class Main {

    int i;

    // constructor can be private or public
    Main(){
        System.out.println("start constructor");
    }

    Main(int i){
        this.i = i;
        System.out.println(i);
    }

    Main(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        new Main();
        new Main(5);
        new Main("hello");
    }
}

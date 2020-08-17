public class Main {
    public static void main(String[] args){

        // need override abstract methods while creating instance of abstract class
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            void method() {
                i = 25;
            }
        };


    }
}

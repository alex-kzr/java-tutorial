public class Example implements ISomeInterface {

        @Override
        public void addTwoDigits(int one, int two) {
            System.out.println(one + two);
        }

        @Override
        public void bounce() {
            System.out.println("bouncing");
        }

}

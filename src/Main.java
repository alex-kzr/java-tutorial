public class Main {

    enum Color { RED, GREEN, BLUE}

    public enum Size { SMALL(200), MEDIUM(300), BIG(400) {
        @Override
        public String getSizeClass(){
            return "B";
        }
    };
        int milliliters;
        String sizeClass = "A";

        Size(int ml){
            this.milliliters = ml;
        }
        int getMilliliters() {
            return milliliters;
        }
        String getSizeClass(){
            return sizeClass;
        }
    }

    public static void main(String[] args){
        Color color = Color.RED;
        Size size1 = Size.MEDIUM;
        Size size3 = Size.BIG;
        System.out.println(color);
        System.out.println(size1);
        System.out.println(size1.milliliters);
        System.out.println(size1.getSizeClass());
        System.out.println(size3.getSizeClass());
    }
}



// enums is something like this
class Color2 {
    public static final Color2 SMALL = new Color2();
    public static final Color2 MEDIUM = new Color2();
    public static final Color2 BIG = new Color2();
}
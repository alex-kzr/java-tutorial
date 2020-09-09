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
//        Color color = Color.RED;
//        Size size1 = Size.MEDIUM;
//        Size size3 = Size.BIG;
//        System.out.println(color);
//        System.out.println(size1);
//        System.out.println(size1.milliliters);
//        System.out.println(size1.getSizeClass());
//        System.out.println(size3.getSizeClass());

        // get all enum values
        for (int i = 0; i < GameLevel.values().length; i++){
            System.out.println(GameLevel.values()[i]);
        }

        // for use in object
        Game game = new Game();
        game.setGameLevel(GameLevel.BEGINNER);

        System.out.println("game.getGameLevel() = " + game.getGameLevel());

        if (game.getGameLevel() == GameLevel.BEGINNER){
            System.out.println(game.getGameLevel().getIndex() + " " + game.getGameLevel().getName());
        }

        switch (game.getGameLevel()) {
            case BEGINNER:
                System.out.println("beg");
                break;
            case PROFESSIONAL:
                System.out.println("pro");
                break;
            case HARD:
                System.out.println("hard");
                break;
            default:
                System.out.println("other");
        }
    }
}



// enums is something like this
class Color2 {
    public static final Color2 SMALL = new Color2();
    public static final Color2 MEDIUM = new Color2();
    public static final Color2 BIG = new Color2();
}
public class Main {

    public static void main(String[] args){

        IGoods goods = new TvSet("Samsung"); // upcast to upper class or interface

        if(goods instanceof TvSet){ // check to avoid ClassCastException
            ((TvSet)goods).setChannel(); // downcast to use methods in realization
        }


    }
}

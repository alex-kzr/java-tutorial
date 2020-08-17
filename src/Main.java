// imports must be in  the first place
import com.mysite.somelib.Human; // import Human class from this package
import com.mysite.somelib.*; // import all classes from this package

public class Main {
    public static void main(String[] args){
        Human human = new Human();
        SuperHuman superHuman = new SuperHuman();
    }
}

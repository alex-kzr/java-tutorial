import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Goodbye");
        list.add("a");
        list.add("b");

        list.sort((s1, s2) -> {
           if (s1.length() > s2.length()) return 1;
           else if (s1.length() < s2.length()) return -1;
           else return 0;
        });

        System.out.println(list);
    }
}

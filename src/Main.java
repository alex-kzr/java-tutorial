import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArr(arr);
        fillList(list);

        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        // map method
        arr = Arrays.stream(arr).map(a -> a * 2).toArray();
        list =  list.stream().map(a -> a * 2).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        //filter method
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);

        //forEach method
        Arrays.stream(arr2).forEach(System.out::println);
        list2.stream().forEach(System.out::println);

        //reduce method
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillList(list3);

        int sum = Arrays.stream(arr3).reduce(5, (accumulator, a) -> accumulator + a);
        int multi = list3.stream().reduce((accumulator, a) -> accumulator * a).get();

        System.out.println(sum);
        System.out.println(multi);
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }
}

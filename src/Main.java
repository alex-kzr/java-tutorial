import java.util.*;

public class Main {
    public static void main(String[] args){

        HashMap<String, Car> hashMap = new HashMap<>();

        hashMap.put("test", new Car("Toyota"));
        hashMap.put("key", new Car("BMW"));
        hashMap.put("niva", new Car("Niva"));
        hashMap.put("car", new Car("Lexus"));

        iterateMap(hashMap);

        TreeMap<String, Car> treeMap = new TreeMap<>();

        treeMap.put("test", new Car("Toyota"));
        treeMap.put("key", new Car("BMW"));
        treeMap.put("niva", new Car("Niva"));
        treeMap.put("car", new Car("Lexus"));
        treeMap.put("test", new Car("Audi")); // duplicate by key will change entry value

        iterateMap(treeMap);

        LinkedHashMap<String, Car> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("test", new Car("Toyota"));
        linkedHashMap.put("key", new Car("BMW"));
        linkedHashMap.put("niva", new Car("Niva"));
        linkedHashMap.put("car", new Car("Lexus"));

        iterateMap(linkedHashMap);
    }

    private static void iterateMap(Map map){

        System.out.println(map.getClass());

        Iterator<Map.Entry<String, Car>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Car> carEntry = iterator.next();
            System.out.println(carEntry.getKey() + ", " + carEntry.getValue());
            //iterator.remove(); // delete element after handling
        }
    }
}

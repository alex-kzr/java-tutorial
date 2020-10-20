import java.util.*;

public class Main {
    public static void main(String[] args){

        EnumSet<Weekday> holidays = EnumSet.of(Weekday.SATURDAY, Weekday.SUNDAY);

        for(Weekday holiday : holidays){
            System.out.println(holiday);
        }

        List<Car> minivanCars = new ArrayList<>();

        minivanCars.add(new Car("Toyota"));
        minivanCars.add(new Car("Volkswagen"));

        List<Car> sportCars = new ArrayList<>();

        sportCars.add(new Car("Ferrari"));
        sportCars.add(new Car("Dodge"));

        EnumMap<CarType, List<Car>> enumMap = new EnumMap<>(CarType.class);

        enumMap.put(CarType.MINIVAN, minivanCars);
        enumMap.put(CarType.SPORT, sportCars);

        iterateMap(enumMap);

        enumMap.get(CarType.SPORT); // get list of sportCars
    }

    private static void iterateMap(Map map){

        System.out.println(map.getClass());

        Iterator<Map.Entry<CarType, Car>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<CarType, Car> carEntry = iterator.next();
            System.out.println(carEntry.getKey() + " - " + carEntry.getValue());
        }
    }
}

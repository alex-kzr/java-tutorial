public class Main {
    public static void main(String[] args){
        System.out.println(Equality.i == Equality.j);
        System.out.println(Relational.s1 == Relational.s2); // false
        System.out.println(Relational.s1.equals(Relational.s2)); // true

        Sample sample1 = new Sample("SampleName");
        Sample sample2 = new Sample("SampleName");

        System.out.println(sample1 == sample2); // false
        System.out.println(sample1.equals(sample2)); // true

        sample2 = sample1;

        System.out.println(sample1 == sample2); // true
    }
}

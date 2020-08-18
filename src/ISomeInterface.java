public interface ISomeInterface extends IBounceable{
    int SOME_VARIABLE = 5; // public static final by default
    void addTwoDigits(int one, int two);
}

interface IBounceable{
    void bounce();
}
// Java Beans conventions
public class Person {
    private String name;
    private boolean blond;


    // name for setters
    public String getName() {
        return name;
    }

    public boolean isBlond() {
        return blond;
    }

    // name for getters
    public void setName(String name) {
        this.name = name;
    }

    public void setBlond(boolean blond) {
        this.blond = blond;
    }
}

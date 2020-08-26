import java.util.Objects;

public class Sample {
    private String name;

    public Sample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sample sample = (Sample) o;
        return name.equals(sample.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

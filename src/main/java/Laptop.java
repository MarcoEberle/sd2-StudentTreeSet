import java.util.Objects;

/**
 * This class represents a Laptop for a Student.
 */
public class Laptop extends Computer {
    /**
     * Type of Laptop.
     */
    private final String type;

    /**
     * Constructor for a new Laptop.
     *
     * @param company - Company that did this Laptop.
     * @param type    - Type of this Laptop.
     */
    public Laptop(String company, String type) {
        super(company);
        this.type = type;
    }

    /**
     * Method that returns the specifications of this Laptop.
     *
     * @return - Returns the Laptop and its specifications.
     */
    @Override
    public String toString() {
        return "Laptop [" + super.toString() + ", " + type + "]";
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(type, laptop.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
import java.util.Objects;

/**
 * This class represents a Computer.
 */
public class Computer {
    /**
     * Company of the Computer.
     */
    private final String company;

    /**
     * Constructor for a new Computer.
     *
     * @param company - Name of the company.
     */
    public Computer(String company) {
        this.company = company;
    }

    /**
     * Method to return the name of the company.
     *
     * @return - Returns the company.
     */
    @Override
    public String toString() {
        return company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return Objects.equals(company, computer.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company);
    }
}

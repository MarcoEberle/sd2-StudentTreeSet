import java.util.Objects;

/**
 * This class represents a Person.
 */
public class Person {
    /**
     * What name does this Person have.
     */
    private final String name;    // Name of the person

    /**
     * Constructor to create a new Person.
     *
     * @param name - Name of the Person.
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Method that returns the name of the Person.
     *
     * @return - Returns the name.
     */
    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
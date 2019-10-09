import java.util.Objects;

/**
 * This class represents a Student.
 */
public class Student extends Person implements Comparable {
    /**
     * Matriculation number of this Student.
     */
    private final int mNr;
    /**
     * Laptop that this Student owns.
     */
    private Laptop laptop;

    /**
     * Constructor to create a new Student.
     *
     * @param name   - Name of this Student
     * @param mNr    - Matriculation number of this Student.
     * @param laptop - Laptop, this Student uses/owns.
     */
    public Student(String name, int mNr, Laptop laptop) {
        super(name);
        this.mNr = mNr;
        this.laptop = laptop;
    }

    /**
     * Getter for the matriculation number.
     *
     * @return - Returns the matriculation number.
     */
    public int getMNr() {
        return mNr;
    }

    /**
     * Method that calls Person's toString() and adds the laptop.
     *
     * @return - Returns all information of this Student.
     */
    @Override
    public String toString() {
        return super.toString() + ", " + getMNr() + ", " + laptop;
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        return getMNr() - other.getMNr();
    }

    public Laptop getLaptop() {
        return laptop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return mNr == student.mNr &&
                Objects.equals(laptop, student.laptop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mNr, laptop);
    }
}

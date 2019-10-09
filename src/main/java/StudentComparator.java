import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student one, Student two) {
        Person first = one;
        Person second = two;
        final int compareName = first.getName().compareTo(second.getName());
        final int compareType = one.getLaptop().getType().compareTo(two.getLaptop().getType());
        final int compareMnr = one.compareTo(two);

        if (compareName == 0) {
            if (compareType == 0) {
                return compareMnr;
            } else {
                return compareType;
            }
        } else {
            return compareName;
        }
    }
}

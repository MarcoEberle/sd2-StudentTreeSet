import java.util.Set;
import java.util.TreeSet;

public class TestMain {

    // test program
    public static void main(String[] args) {

        Laptop l1 = new Laptop("Apple", "Mac");
        Laptop l2 = new Laptop("Lenovo", "Thinkpad");
        Laptop l3 = new Laptop("Apple", "Mac");

        Student student1 = new Student("Annie", 234564, l3);
        Student student2 = new Student("Max", 234568, l2);
        Student student3 = new Student("Ada", 234563, l2);
        Student student4 = new Student("Ada", 234568, l1);
        Student student5 = new Student("Ada", 234562, l1);

        Set<Student> set1 = new TreeSet<>();
        set1.add(student1);
        set1.add(student2);
        set1.add(student3);
        set1.add(student4);
        set1.add(student5);
        System.out.println(set1);

        Set<Student> set2 = new TreeSet<>(new StudentComparator());
        set2.add(student1);
        set2.add(student2);
        set2.add(student3);
        set2.add(student4);
        set2.add(student5);
        System.out.println(set2);


    }


}


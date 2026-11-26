import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class GenericInsertionSort<T extends Comparable<? super T>> implements Sorting<T> {
    @Override
    public void sort(List<T> a) {
        for (int k = 1; k < a.size(); k++) {
            T tmp = a.get(k);
            int p = k - 1;
            while (p >= 0 && a.get(p).compareTo(tmp) > 0) {
                a.set(p + 1, a.get(p));
                p--;
            }
            a.set(p + 1, tmp);
        }
    }

    private static <E extends Comparable<? super E>> void sortAndPrint(List<E> list) {
        new GenericInsertionSort<E>().sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        sortAndPrint(new ArrayList<>(Arrays.asList(5, -2, 9, 0, 5)));
        sortAndPrint(new ArrayList<>(Arrays.asList("pear", "apple", "Banana", "apple")));
        sortAndPrint(new ArrayList<>(Arrays.asList(
                LocalDateTime.of(2026, 11, 26, 12, 0),
                LocalDateTime.of(2025, 1, 1, 0, 0),
                LocalDateTime.of(2026, 11, 26, 9, 30))));
        sortAndPrint(new ArrayList<>(Arrays.asList(
                UUID.fromString("3f2504e0-4f89-11d3-9a0c-0305e82c3301"),
                UUID.fromString("123e4567-e89b-12d3-a456-426614174000"),
                UUID.fromString("6ba7b810-9dad-11d1-80b4-00c04fd430c8"))));

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Vasya", 21), new Student("Anton", 19), new Student("Petr", 20)));
        new GenericInsertionSort<Student>().sort(students);
        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getAge());
        }
    }
}

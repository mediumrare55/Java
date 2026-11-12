import java.util.List;

public class StudentSort implements Sorting<Student> {
    @Override
    public void sort(List<Student> list) {
        sortAge(list);
        sortName(list);
    }

    private void sortName(List<Student> list) {
        for (int k = 1; k < list.size(); k++) {
            Student tmp = list.get(k);
            int p = k - 1;
            while (p >= 0 && list.get(p).getName().compareTo(tmp.getName()) > 0) {
                list.set(p + 1, list.get(p));
                p--;
            }
            list.set(p + 1, tmp);
        }
    }

    private void sortAge(List<Student> list) {
        for (int k = 1; k < list.size(); k++) {
            Student tmp = list.get(k);
            int p = k - 1;
            while (p >= 0 && list.get(p).getAge() > tmp.getAge()) {
                list.set(p + 1, list.get(p));
                p--;
            }
            list.set(p + 1, tmp);
        }
    }
}

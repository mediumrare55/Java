import java.util.List;

public class TableSort implements Sorting<StudentRecord> {
    @Override
    public void sort(List<StudentRecord> list) {
        sortName(list);
        sortGrade(list);
        sortGroup(list);
    }

    private void sortName(List<StudentRecord> list) {
        for (int k = 1; k < list.size(); k++) {
            StudentRecord tmp = list.get(k);
            int p = k - 1;
            while (p >= 0 && list.get(p).getName().compareTo(tmp.getName()) > 0) {
                list.set(p + 1, list.get(p));
                p--;
            }
            list.set(p + 1, tmp);
        }
    }

    private void sortGrade(List<StudentRecord> list) {
        for (int k = 1; k < list.size(); k++) {
            StudentRecord tmp = list.get(k);
            int p = k - 1;
            while (p >= 0 && list.get(p).getGrade() < tmp.getGrade()) {
                list.set(p + 1, list.get(p));
                p--;
            }
            list.set(p + 1, tmp);
        }
    }

    private void sortGroup(List<StudentRecord> list) {
        for (int k = 1; k < list.size(); k++) {
            StudentRecord tmp = list.get(k);
            int p = k - 1;
            while (p >= 0 && list.get(p).getGroup() > tmp.getGroup()) {
                list.set(p + 1, list.get(p));
                p--;
            }
            list.set(p + 1, tmp);
        }
    }
}

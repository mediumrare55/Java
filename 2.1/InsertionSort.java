import java.util.List;

public class InsertionSort implements Sorting<Integer> {
    @Override
    public void sort(List<Integer> a) {
        for (int k = 1; k < a.size(); k++) {
            int tmp = a.get(k);
            int p = k - 1;
            while (p >= 0 && a.get(p) > tmp) {
                a.set(p + 1, a.get(p));
                p--;
            }
            a.set(p + 1, tmp);
        }
    }
}

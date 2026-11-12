import java.util.List;

public class MergeSort implements Sorting<Integer> {
    private void slice(List<Integer> a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            slice(a, l, m);
            slice(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    private void merge(List<Integer> a, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] a1 = new int[n1];
        int[] a2 = new int[n2];

        for (int t = 0; t < n1; t++) {
            a1[t] = a.get(l + t);
        }
        for (int t = 0; t < n2; t++) {
            a2[t] = a.get(m + 1 + t);
        }

        int p1 = 0;
        int p2 = 0;
        int cur = l;

        while (p1 < n1 && p2 < n2) {
            if (a1[p1] <= a2[p2]) {
                a.set(cur, a1[p1]);
                p1++;
            } else {
                a.set(cur, a2[p2]);
                p2++;
            }
            cur++;
        }

        while (p1 < n1) {
            a.set(cur, a1[p1]);
            p1++;
            cur++;
        }

        while (p2 < n2) {
            a.set(cur, a2[p2]);
            p2++;
            cur++;
        }
    }

    @Override
    public void sort(List<Integer> a) {
        slice(a, 0, a.size() - 1);
    }
}

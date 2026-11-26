import java.util.List;

public class CountingSort implements Sorting<Integer> {
    @Override
    public void sort(List<Integer> a) {
        int[] cnt = new int[128];

        for (int j = 0; j < a.size(); j++) {
            cnt[a.get(j)]++;
        }

        int k = 0;
        for (int x = 0; x < cnt.length; x++) {
            for (int t = 0; t < cnt[x]; t++) {
                a.set(k, x);
                k++;
            }
        }
    }
}

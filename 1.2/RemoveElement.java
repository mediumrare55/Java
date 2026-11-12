public class RemoveElement {
    public int removeElementInplace(int[] a, int x) {
        int cnt = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] != x) {
                a[cnt] = a[j];
                cnt++;
            }
        }
        return cnt;
    }
}

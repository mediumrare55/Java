import java.math.BigInteger;
import java.util.List;

public class RadixSort implements Sorting<BigInteger> {
    private static final int DIGITS = 20;

    @Override
    public void sort(List<BigInteger> a) {
        String[] strs = new String[a.size()];
        for (int j = 0; j < strs.length; j++) {
            strs[j] = pad(a.get(j).toString());
        }

        for (int k = DIGITS - 1; k >= 0; k--) {
            strs = sortByDigit(strs, k);
        }

        for (int j = 0; j < strs.length; j++) {
            a.set(j, new BigInteger(strs[j]));
        }
    }

    private String[] sortByDigit(String[] strs, int k) {
        int[] cnt = new int[10];
        for (String s : strs) {
            cnt[s.charAt(k) - '0']++;
        }

        int[] start = new int[10];
        for (int d = 1; d < 10; d++) {
            start[d] = start[d - 1] + cnt[d - 1];
        }

        String[] buf = new String[strs.length];
        for (String s : strs) {
            int d = s.charAt(k) - '0';
            buf[start[d]] = s;
            start[d]++;
        }
        return buf;
    }

    private String pad(String s) {
        StringBuilder sb = new StringBuilder();
        for (int j = s.length(); j < DIGITS; j++) {
            sb.append('0');
        }
        return sb.append(s).toString();
    }
}

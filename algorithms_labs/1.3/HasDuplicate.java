import java.util.Arrays;

public class HasDuplicate {
    public boolean hasDuplicate(int[] mas) {
        Arrays.sort(mas);
        for (int k = 1; k < mas.length; k++) {
            if (mas[k] == mas[k - 1]) return true;
        }
        return false;
    }
}

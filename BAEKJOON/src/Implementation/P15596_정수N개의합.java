package Implementation;

public class P15596_정수N개의합 {
    long sum(int[] a) {
        long sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }
}

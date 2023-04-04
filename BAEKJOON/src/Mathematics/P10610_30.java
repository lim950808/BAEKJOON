package Mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class P10610_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next(); // 80875542
        int arr[] = new int[N.length()];
        int total = 0;

        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i) - 48;
            total += arr[i];
        }

        Arrays.sort(arr);

        if ((total % 3 == 0) && (arr[0] == 0)) {
            for (int i = N.length() - 1; i > -1; i--) {
                System.out.print(arr[i]); // 88755420
            }
        } else {
            System.out.println(-1);
        }
    }
}
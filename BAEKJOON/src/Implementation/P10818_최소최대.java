package Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class P10818_최소최대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 5
        int arr[] = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 20 10 35 30 7
        }

        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[num - 1]); // 7 35
    }
}

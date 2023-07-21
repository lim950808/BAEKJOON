package Sorting;

import java.util.Scanner;

public class P11557_YangjojangofTheYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            int s = scanner.nextInt();
            String[] n = new String[s];
            int[] d = new int[s];

            for (int k = 0; k < s; k++) {
                n[k] = scanner.next();
                d[k] = scanner.nextInt();
            }

            int max = d[0];
            int index = 0;

            for (int k = 0; k < d.length; k++) {
                if (max < d[k]) {
                    max = d[k];
                    index = k;
                }
            }

            System.out.println(n[index]);
        }
    }
}
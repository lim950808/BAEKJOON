package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class P2605_줄세우기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int N = sc.nextInt(); // 5

        for (int i = 1; i <= N; i++) {
            list.add(sc.nextInt(), i); // 0 1 1 3 2
        }

        for (int i = N - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " "); // 4 2 5 3 1
        }
    }
}
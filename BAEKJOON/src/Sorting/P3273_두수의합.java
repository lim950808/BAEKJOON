package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P3273_두수의합 {
    static int n, x, count;
    static int arr[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("수열의 크기 n 입력 : ");
        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        HashSet<Integer> set = new HashSet<>();

        System.out.println("수열에 포함되는 수 " + n + "개 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            set.add(arr[i]);
        }

        System.out.println("x 입력 : ");
        x = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if (set.contains(x - arr[i])) {
                count++;
            }
        }

        System.out.println("자연수 " + x + "가 주어졌을 때, ai + aj = " + x + " (1 ≤ i < j ≤ " + n + ")을 만족하는 (ai, aj)쌍의 수 출력 : ");
        System.out.println(count / 2);
    }
}

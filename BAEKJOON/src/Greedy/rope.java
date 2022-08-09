package Greedy;
//로프
import java.util.Arrays;
import java.util.Scanner;

public class rope {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //첫째 줄에 정수 N
        int N = scanner.nextInt();
        int[] ropes = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            ropes[i] = scanner.nextInt();
        }

        Arrays.sort(ropes);

        //N개의 줄에 각 로프가 버틸 수 있는 최대 중량
        int max = ropes[N];
        for (int i = 1; i < N; i++) {
            max = Math.max(max, ropes[i] * (N - (i - 1)));
        }

        System.out.println(max);
    }
}
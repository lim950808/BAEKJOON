package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2212_센서 {
    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("센서의 개수 N 입력 : ");
        int N = Integer.valueOf(br.readLine());

        System.out.println("집중국의 개수 K 입력 : ");
        int K = Integer.valueOf(br.readLine());

        int[] sensors = new int[N];
        int[] distances = new int[N - 1];

        System.out.println(N + "개의 센서의 좌표 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.valueOf(st.nextToken());
            sensors[i] = num;
        }

        Arrays.sort(sensors);

        for (int i = 0; i < N - 1; i++) {
            int distance = sensors[i + 1] - sensors[i];
            distances[i] = distance;
        }

        Arrays.sort(distances);

        int sum = 0;

        for (int i = 0; i < N - K; i++) {
            sum += distances[i];
        }

        System.out.println(K + "개의 집중국의 수신 가능 영역의 길이의 합의 최솟값을 출력 : ");
        System.out.println(sum);
    }
}

package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P20115_에너지드링크 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("에너지 드링크의 수 N 입력 : ");
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];

        int amount = 0;

        System.out.println("각 에너지 드링크의 양을 공백으로 구분되어 입력 : ");
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            amount = list[i] > amount ? list[i] : amount;
        }

        double max = amount;

        for (int i = 0; i < N; i++) {
            if (list[i] != amount) {
                max += list[i] / 2.0;
            }
        }

        System.out.println("최대로 만들 수 있는 에너지 드링크의 양을 출력 : ");
        System.out.println(max);
    }
}

package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class P10816_숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        System.out.println("상근이가 가지고 있는 숫자 카드의 개수 N : ");
        int N = Integer.parseInt(br.readLine());

        System.out.println("숫자 카드에 적혀있는 정수 : ");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int card = Integer.parseInt(st.nextToken());
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        System.out.println("상근이가 가지고 있는 숫자 카드의 개수 M : ");
        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        System.out.println("상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수 : ");
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int card = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(card, 0)).append(' ');
        }

        System.out.println("각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력 : ");
        System.out.println(sb);
    }
}

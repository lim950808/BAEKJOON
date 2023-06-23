package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2163_초콜릿자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("초콜릿의 가로 N, 세로 M : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        System.out.println("1×1 크기의 초콜릿으로 쪼개기 위한 최소 쪼개기 횟수 : ");
        System.out.print(N * M - 1 + "번");
    }
}

package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2530_인공지능시계 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23), 분 B (0 ≤ B ≤ 59)와 초 C (0 ≤ C ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println("두 번째 줄에는 요리하는 데 필요한 시간 D (0 ≤ D ≤ 500,000)가 초 단위로 주어진다.");
        int D = Integer.parseInt(br.readLine());

        B += D / 60;
        C += D % 60;
        B += C / 60;
        C = C % 60;
        A += B / 60;
        B = B % 60;
        A = A % 24;

        System.out.println("종료되는 시각의 시, 분, 초을 공백을 사이에 두고 출력 : ");
        System.out.println(A + " " + B + " " + C);
    }
}

package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1476_날짜계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("지구, 태양, 달을 각각 나타내는 E, S, M 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken()); // 지구
        int S = Integer.parseInt(st.nextToken()); // 태양
        int M = Integer.parseInt(st.nextToken()); // 달

        int year = 0;

        while (true) {
            year++;
            if ((year - E) % 15 == 0
                && (year - S) % 28 == 0
                && (year - M) % 19 == 0)
                break;
        }

        System.out.println(E + ", " + S + ", " + M + "으로 표시되는 가장 빠른 연도를 출력 (1 1 1은 항상 1이기 때문에, 정답이 음수가 나오는 경우는 없다.) : ");
        System.out.print(year);
    }
}

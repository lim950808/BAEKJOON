package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15552_빠른AplusB {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("테스트케이스의 개수 T : ");
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        System.out.println("두 정수 A와 B 입력 : ");
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            int num = str.indexOf(" ");
            int result = Integer.parseInt(str.substring(0, num)) + Integer.parseInt(str.substring(num + 1));
            sb.append(result + "\n");
        }

        br.close();

        System.out.println("각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력 : ");
        System.out.print(sb);
    }
}

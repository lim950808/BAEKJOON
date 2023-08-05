package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5597_과제안내신분 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[31];

        System.out.println("총 28줄로 각 제출자(학생)의 출석번호 n 입력(중복 없음) :");
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n] = true;
        }

        System.out.println("제출 안 한 학생 2명의 출석번호를 오름차순으로 출력 : ");
        for (int i = 1; i <= 30; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }
}

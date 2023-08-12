package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P7568_덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("전체 사람의 수 N 입력 : ");
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        String[] str;

        System.out.println(N + "개의 줄에는 각 사람의 몸무게와 키를 나타내는 양의 정수 x(kg)와 y(cm)를 하나의 공백을 두고 각각 입력 : ");
        for (int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            sb.append(rank).append(' ');
        }

        System.out.println(N + "명의 덩치 등수를 구해서 그 순서대로 출력해야 한다. 단, 각 덩치 등수는 공백문자로 분리되어야 한다.");
        System.out.println(sb);
    }
}

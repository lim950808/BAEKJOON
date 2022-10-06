import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// 주몽
public class P1940_주몽 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine()); // 재료의 개수(N) 입력
        int M = Integer.parseInt(bf.readLine()); // 갑옷을 만드는데 필요한 수(M) 입력
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine()); // N개의 재료들이 가진 고유한 번호들 입력

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken()); // 재료 배열 저장
        }

        Arrays.sort(A); // 재료 배열 정렬

        int count = 0;
        int i = 0;
        int j = N - 1;

        while (i < j) {
            if (A[i] + A[j] < M) { // if(재료합 < M) 작은 번호 재료를 한 칸 위로 변경
                i++;
            } else if (A[i] + A[j] > M) { // else if(재료합 > M) 큰 번호 재료를 한 칸 아래로 변경
                j--;
            } else { // else 경우의 수 증가, 양쪽 index 각각 변경
                count++;
                i++;
                j--;
            }
        }

        System.out.println(count); // count 출력
        bf.close();
    }
}
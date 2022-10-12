package PrefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 구간 합 구하기 4
public class P11659_구간합구하기4 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken()); // 숫자 개수
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 질의 개수
        long[] S = new long[suNo + 1]; // 합 배열. 0번째 index를 무시하기 위해 +1
        stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 한 줄로 받아옴

        for (int i = 1; i <= suNo; i++) { // 숫자 개수만큼 반복
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken()); // 수들을 입력받음과 동시에 합 배열을 생성
        }

        for (int q = 0; q < quizNo; q++) { // 질의 개수만큼 반복
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 한 줄로 받아옴
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]); // 구간의 합을 구하는 공식
        }
    }
}
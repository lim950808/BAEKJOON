package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1120_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("문자열 A와 B 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        int answer = A.length();

        for (int i = 0; i <= B.length() - A.length(); i++) {
            int temp = 0 ;
            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(j + i)) {
                    temp++;
                }
            }
            answer = Math.min(answer, temp);
        }

        System.out.println("A와 B의 길이가 같으면서, A와 B의 차이를 최소가 되도록 했을 때, 그 차이를 출력 : ");
        System.out.println(answer);
    }
}

package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1213_펠린드롬만들기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("임한수의 영어 이름을 입력 : ");
        String str = br.readLine();

        int[] alphabet = new int[26];

        for (char ch : str.toCharArray()) {
            alphabet[ch - 'A']++;
        }

        int n = 0;
        int mid = 0;

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] % 2 == 1) {
                mid = i;
                n++;
            }
        }

        StringBuilder sb = new StringBuilder();

        if ((str.length() % 2 == 1 && n > 1) || (str.length() % 2 == 0 && n > 0)) {
            sb.append("I'm Sorry Hansoo");
        } else {
            String answer = "";
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < alphabet[i] / 2; j++) {
                    answer += (char) (i + 'A');
                }
            }
            String reverse = new StringBuilder(answer).reverse().toString();
            if (n == 1) {
                answer += (char) (mid + 'A');
            }
            sb.append(answer + reverse);
        }

        System.out.println(str + "의 펠린드롬을 출력한다. 만약 불가능할 때는 \"I'm Sorry Hansoo\"를 출력한다. 정답이 여러 개일 경우에는 사전순으로 앞서는 것을 출력한다.");
        System.out.print(sb);
    }
}

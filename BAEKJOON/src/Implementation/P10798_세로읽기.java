package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10798_세로읽기 {
public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    char[][] c = new char[5][15];
    int max = 0;

    System.out.println("최소 1개, 최대 15개의 글자들을 빈칸 없이 연속으로 입력 (영어 대문자 ‘A’부터 ‘Z’, 영어 소문자 ‘a’부터 ‘z’, 숫자 ‘0’부터 ‘9’) : ");
    for (int i = 0; i < c.length; i++) {
        String str = br.readLine();
        if (max < str.length()) max = str.length();

        for (int j = 0; j < str.length(); j++) {
            c[i][j] = str.charAt(j);
        }
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < max; i++) {
        for (int j = 0; j < 5; j++) {
            if (c[j][i] == '\0') continue;
            sb.append(c[j][i]);
        }
    }

    System.out.println("세로로 읽은 순서대로 글자들을 출력 : ");
    System.out.println(sb);
    }
}

package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P10814_나이순정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("온라인 저지 회원의 수 N : ");
        int N = Integer.parseInt(br.readLine()); // 3
        StringBuilder[] s = new StringBuilder[201];

        for (int i = 0; i < s.length; i++) {
            s[i] = new StringBuilder();
        }

        System.out.println("온라인 저지에 가입한 " + N + "명의 나이와 이름 : ");
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            //21 Junkyu
            //21 Dohyun
            //20 Sunyoung
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            s[age].append(age).append(' ').append(name).append('\n');
        }

        StringBuilder sb = new StringBuilder();

        for (StringBuilder val : s) {
            sb.append(val);
        }

        System.out.println("온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력 : ");
        System.out.println(sb);
        //20 Sunyoung
        //21 Junkyu
        //21 Dohyun
    }
}

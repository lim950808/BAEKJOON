package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P17219_비밀번호찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("저장된 사이트 주소의 수 N과 비밀번호를 찾으려는 사이트 주소의 수 M 입력 : ");
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        Map<String, String> map = new HashMap<>();

        System.out.println(N + "개의 줄에 걸쳐 각 줄에 사이트 주소와 비밀번호가 공백으로 구분되어 주어진다. 사이트 주소는 알파벳 소문자, 알파벳 대문자, 대시('-'), 마침표('.')로 이루어져 있고, 중복되지 않는다. 비밀번호는 알파벳 대문자로만 이루어져 있다. 모두 길이는 최대 20자이다.");
        for (int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            map.put(str[0], str[1]);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            sb.append(map.get(br.readLine())).append('\n');
        }

        System.out.println(M + "개의 줄에 걸쳐 비밀번호를 찾으려는 사이트 주소의 비밀번호를 차례대로 각 줄에 하나씩 출력 : ");
        System.out.println(sb);
    }
}

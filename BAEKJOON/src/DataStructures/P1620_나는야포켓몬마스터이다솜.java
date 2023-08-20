package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P1620_나는야포켓몬마스터이다솜 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        System.out.println("포켓몬 수 N와 맞춰야 하는 문제의 개수 M 입력 :");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();

        System.out.println(N + "개의 포켓몬 이름 입력 :");
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            map1.put(i, str);
            map2.put(str, i);
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (49 <= str.charAt(0) && str.charAt(0) <= 57) {
                sb.append(map1.get(Integer.parseInt(str))).append("\n");
            } else {
                sb.append(map2.get(str)).append("\n");
            }
        }

        System.out.println(M + "개의 줄에 각각의 문제에 대한 답 출력(입력으로 숫자가 들어왔다면 그 숫자에 해당하는 포켓몬의 이름을, 문자가 들어왔으면 그 포켓몬의 이름에 해당하는 번호를 출력) :");
        System.out.println(sb);
    }
}

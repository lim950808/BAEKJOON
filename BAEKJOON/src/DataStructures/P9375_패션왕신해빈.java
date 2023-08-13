package DataStructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P9375_패션왕신해빈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        System.out.println("테스트 케이스 T 입력 : ");
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            HashMap<String, Integer> map = new HashMap<>();

            System.out.println("해빈이가 가진 의상의 수 n 입력 : ");
            int n = Integer.parseInt(br.readLine());

            System.out.println("해빈이가 가진 의상의 이름과 의상의 종류가 공백으로 구분되어 주어진다. 같은 종류의 의상은 하나만 입을 수 있다.");
            while (n-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String str = st.nextToken();
                if (map.containsKey(str)) {
                    map.put(str, map.get(str) + 1);
                } else {
                    map.put(str, 1);
                }
            }

            int result = 1;

            for (int val : map.values()) {
                result *= (val + 1);
            }

            sb.append(result - 1).append('\n');
        }

        System.out.println("각 테스트 케이스에 대해 해빈이가 알몸이 아닌 상태로 의상을 입을 수 있는 경우를 출력 : ");
        System.out.println(sb);
    }
}

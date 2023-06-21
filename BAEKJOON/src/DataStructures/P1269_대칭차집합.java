package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P1269_대칭차집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("집합 A의 원소의 개수와 집합 B의 원소의 개수가 빈 칸을 사이에 두고 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashSet<Integer> set = new HashSet<>();

        System.out.println("집합 A의 모든 원소 : ");
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println("집합 B의 모든 원소 : ");
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        System.out.println("대칭 차집합의 원소의 개수를 출력 : ");
        System.out.println(set.size());
    }
}
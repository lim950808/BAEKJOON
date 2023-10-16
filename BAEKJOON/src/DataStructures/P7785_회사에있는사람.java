package DataStructures;

import java.util.*;

public class P7785_회사에있는사람 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("로그에 기록된 출입 기록의 수 N 입력 : ");
        int N = sc.nextInt();

        String[][] records = new String[N][2];

        System.out.println(N + "개의 줄에 출입 기록을 순서대로 입력 : ");
        for (int i = 0; i < N; i++) {
            records[i][0] = sc.next();
            records[i][1] = sc.next();
        }

        Arrays.sort(records, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o2[0].compareTo(o1[0]);
            }
        });

        System.out.println("현재 회사에 있는 사람의 이름을 사전 순의 역순으로 한 줄에 한 명씩 출력 : ");
        for (int i = 0; i < N - 1; i++) {
            if (records[i][1].equals("enter") && !records[i][0].equals(records[i + 1][0]))
                System.out.println(records[i][0]);
        }

        if (records[N - 1][1].equals("enter")) {
            System.out.println(records[N - 1][0]);
        }
    }
}

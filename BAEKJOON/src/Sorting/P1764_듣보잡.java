package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class P1764_듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]); // 3
        int M = Integer.parseInt(str[1]); // 4

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
            //ohhenrie
            //charlie
            //baesangwook
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String temp = br.readLine();
            if (set.contains(temp)) {
                list.add(temp);
                //obama
                //baesangwook
                //ohhenrie
                //clinton
            }
        }

        Collections.sort(list);

        System.out.println(list.size()); // 2

        for (String s : list) {
            System.out.println(s);
            //baesangwook
            //ohhenrie
        }
    }
}

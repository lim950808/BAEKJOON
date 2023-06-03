package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class P1302_베스트셀러 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        String str = new String();

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            if (map.containsKey(str)) {
                map.replace(str, map.get(str)+1);
            } else {
                map.put(str, 1);
            }
        }

        int max = 0;

        for (String s : map.keySet()) {
            max = Math.max(max, map.get(s));
        }

        ArrayList<String> list = new ArrayList<String>(map.keySet());

        Collections.sort(list);

        for (String b : list) {
            if (map.get(b) == max) {
                System.out.println(b);
                break;
            }
        }
    }
}

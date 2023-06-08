package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10808_알파벳개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];

        System.out.println("단어 S : ");
        String S = br.readLine();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            arr[c - 97]++;
        }

        System.out.println("a부터 z까지 각 알파벳이 단어에 몇 개가 포함되어 있는지 출력 : ");
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

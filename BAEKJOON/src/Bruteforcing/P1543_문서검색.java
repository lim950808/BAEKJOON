package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1543_문서검색 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("문서 : ");
        String S1 = br.readLine();

        System.out.println("검색하고 싶은 단어 : ");
        String S2 = br.readLine();

        int size1 = S1.length();
        int size2 = S2.length();

        S1 = S1.replace(S2, "");

        System.out.println("문서에 " + S2 + "가 중복되지 않게 최대 몇 번 등장하는지 출력 : ");
        System.out.println((size1 - S1.length()) / size2 + "번");
    }
}

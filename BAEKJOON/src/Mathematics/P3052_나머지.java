package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P3052_나머지 {
    public static void main(String[] args) throws IOException {

        boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 입력 : ");
        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int count = 0;

        for (boolean a : arr) {
            if (a) {
                count++;
            }
        }

        System.out.println("42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력 : ");
        System.out.println(count);
    }
}

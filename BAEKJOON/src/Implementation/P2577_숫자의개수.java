package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2577_숫자의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()); // 150 * 266 * 427
        int[] arr = new int[10];

        while (num != 0) {
            arr[num % 10]++;
            num /= 10;
        }

        // A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지 출력
        for (int result : arr) {
            System.out.println(result);
            //3
            //1
            //0
            //2
            //0
            //0
            //0
            //2
            //0
            //0
        }
    }
}

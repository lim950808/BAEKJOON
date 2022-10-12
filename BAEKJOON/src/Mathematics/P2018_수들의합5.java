package Mathematics;

import java.util.Scanner;
// 수들의 합 5
public class P2018_수들의합5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 입력된 자연수 N
        int count = 1; // 가지 수 초기화
        int start_index = 1; // 시작 인덱스 초기화
        int end_index = 1; // 종료 인덱스 초기화
        int sum = 1; // 포인터가 이동할 때마다 현재의 총합

        while (end_index != N) {
            if (sum == N) {         //sum == N ->  End index++;  sum = sum + End index;  count++;
                count++;
                end_index++;
                sum = sum + end_index;
            } else if (sum > N) {   //sum > N ->  sum = sum - Start index;  Start index++;
                sum = sum - start_index;
                start_index++;
            } else {                //sum < N ->  End index++;  sum = sum + End index;
                end_index++;
                sum = sum + end_index;
            }
        }
        // 입력된 자연수 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지 수(count)를 출력
        System.out.println(count);
    }
}
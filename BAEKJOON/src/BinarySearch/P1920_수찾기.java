package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;
// 수 찾기
public class P1920_수찾기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정렬할 수 개수 N
        int[] A = new int[N]; // 정렬할 배열 A 선언

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A); // A 배열 정렬
        int M = sc.nextInt(); // 탐색할 숫자의 개수 M

        for (int i = 0; i < M; i++) { // M의 개수만큼 반복
            boolean find = false;
            int target = sc.nextInt(); // 찾아야 하는 수
            // 이진 탐색 시작
            int start = 0; // 시작 인덱스
            int end = A.length - 1; // 종료 인덱스
            while (start <= end) {
                int midi = (start + end) / 2; // 중간 인덱스
                int midV = A[midi];
                if (midV > target) {
                    end = midi - 1;
                } else if (midV < target) {
                    start = midi + 1;
                } else {
                    find = true; // 찾으면 반복문 종료
                    break;
                }
            }
            if (find) { // 찾았으면 1 출력
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
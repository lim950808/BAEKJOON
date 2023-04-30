package DataStructures;

import java.util.Arrays;
import java.util.Scanner;
class P10815_숫자카드 {
    private static int N;
    private static int[] arr;
    private static int M;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("상근이가 가지고 있는 숫자 카드의 개수 N : ");
        N = sc.nextInt(); // 5

        System.out.println("숫자 카드에 적혀있는 정수 : ");
        arr = new int[N]; // 6 3 2 10 -10
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("정수 M개 : ");
        M = sc.nextInt(); // 8

        System.out.println("상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 M개의 정수 : ");
        for (int i = 0; i < M; i++) {
            int m = sc.nextInt(); // 10 9 -5 2 3 4 5 -10
            int left = 0;
            int right = N - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                int n = arr[mid];
                if (n == m) {
                    sb.append(1 + " ");
                    break;
                }
                if (n > m) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                if (left > right) {
                    sb.append(0 + " ");
                    break;
                }
            }
        }

        System.out.println("각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력 : ");
        System.out.println(sb.toString()); // 1 0 0 1 1 0 0 1
    }
}

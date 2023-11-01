package BinarySearch;

import java.util.Scanner;

public class P2343_기타레슨 {
    public static boolean isPossible(int[] lengths, int videoLength, int videoCount) {
        int nowLength = 0;
        int nowCount = 1;

        for (int length : lengths) {
            if (length > videoLength) {
                return false;
            }
            if (nowLength + length > videoLength) {
                if (++nowCount > videoCount) {
                    return false;
                }
                nowLength = 0;
            }
            nowLength += length;
        }

        return true;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("강의의 수 N 입력 : ");
        int N = sc.nextInt();

        System.out.println("M 입력 : ");
        int M = sc.nextInt();

        int[] lengths = new int[N];

        System.out.println("강토의 기타 강의의 길이가 강의 순서대로 분 단위로(자연수)로 입력 : ");
        for (int i = 0; i < N; i++) {
            lengths[i] = sc.nextInt();
        }

        int l = 1;
        int r = N * 10000;
        int answer = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (isPossible(lengths, m, M)) {
                answer = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        System.out.println("가능한 블루레이 크기 중 최소를 출력 : ");
        System.out.println(answer);
    }
}

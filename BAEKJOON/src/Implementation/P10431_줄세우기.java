package Implementation;

import java.util.Scanner;

public class P10431_줄세우기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("테스트 케이스의 수 P 입력 : ");
        int P = sc.nextInt();

        System.out.println("테스트 케이스 번호 T와 20개의 양의 정수를 공백으로 구분되어 입력 : ");
        while (P-- > 0) {
            int T = sc.nextInt();
            int[] height = new int[20];

            for (int i = 0; i < 20; i++)
                height[i] = sc.nextInt();

            int cnt = 0;

            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < i; j++) {
                    if (height[j] > height[i]) {
                        int h = height[i];
                        for (int k = i; k > j; k--) {
                            height[k] = height[k - 1];
                            cnt++;
                        }
                        height[j] = h;
                        break;
                    }
                }
            }

            System.out.println("각각의 테스트 케이스에 대해 테스트 케이스의 번호와 학생들이 뒤로 물러난 걸음 수의 총합을 공백으로 구분하여 출력 : ");
            System.out.println(T + " " + cnt);
        }
    }
}

package Implementation;

import java.util.Scanner;
// OX퀴즈
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("테스트 횟수 입력 : ");

        // 테스트 횟수를 입력받아 배열에 담는다.
        String[] arr = new String[sc.nextInt()];

        // 배열 크기만큼 반복
        // 인덱스가 하나씩 늘어날 때마다 배열에 값을 추가
        for (int i=0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        sc.close();

        for(int i =0; i < arr.length; i++) {
            int cnt = 0; // 연속횟수
            int sum = 0; // 누적합산
            for (int j=0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'O') { // 입력된 값이 O(대문자)이면 연속횟수가 늘어남
                    cnt++;
                } else { // 입력된 값이 O이 아닐시 (X 일시) 카운트는 0
                    cnt = 0;
                }
                sum += cnt; // 연속횟수만큼 누적합산
            }
            System.out.println(sum);
        }
        System.out.println("OX퀴즈를 종료합니다.");
    }
}
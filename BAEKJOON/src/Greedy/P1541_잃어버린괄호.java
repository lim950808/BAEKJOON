package Greedy;

import java.util.Scanner;
// 잃어버린 괄호
public class P1541_잃어버린괄호 {

    static int answer = 0; // 정답 변수 answer

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String example = sc.nextLine();
        String[] str = example.split("-"); // 들어온 데이터를 "-"를 기준으로 split() 수행

        for (int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]); // 결과값 = mySum() 함수 수행
            if (i == 0)
                answer = answer + temp; // 제일 앞에 것만 더해주고
            else
                answer = answer - temp; // 뒤에 부분은 더한 값들을 빼줌
        }
        System.out.println(answer); // answer 출력
    }

    static int mySum(String a) { // 나눠진 그룹의 더하기 연산 수행 함수 mySum()
        int sum = 0;
        String temp[] = a.split("[+]"); // 현재 들어온 String 값을 "[+]"를 기준으로 split() 수행
        for (int i = 0; i < temp.length; i++) { // 나눠진 데이터 개수만큼 반복
            sum += Integer.parseInt(temp[i]); // String 값을 Integer 형으로 변환해 리턴값 sum에 더하기
        }
        return sum; // sum 출력
    }
}
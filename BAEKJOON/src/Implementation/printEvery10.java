package Implementation;

import java.util.Scanner;
//열 개씩 끊어 출력하기
public class printEvery10 {
   
   public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine(); //nextLine: 한 줄 단위로 입력받기 때문에 개행문자도 한 줄로 인식

       //10개씩 끊어서 한 줄에 하나씩 출력
       for(int i=0; i<input.length(); i++) {
           //배열번호 i의 값이 10으로 나누었을 때 나머지가 0이고 i값이 0이 아니면 한 줄 띄운다.
           if(i % 10 == 0 && i != 0)
               System.out.println();
           System.out.print(input.charAt(i));
       }
       
   }
   
}
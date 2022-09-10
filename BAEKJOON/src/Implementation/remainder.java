package Implementation;

import java.util.Scanner;
//나머지
public class remainder {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        int num1 = (a + b) % c;
        int num2 = ((a % c) + (b % c)) % c;
        int num3 = (a * b) % c;
        int num4 = ((a % c) * (b % c)) % c;

        System.out.println(num1); //첫째 줄에 (A+B)%C
        System.out.println(num2); //둘째 줄에 ((A%C) + (B%C))%C
        System.out.println(num3); //셋째 줄에 (A×B)%C
        System.out.println(num4); //넷째 줄에 ((A%C) × (B%C))%C를 출력
    }
    
}
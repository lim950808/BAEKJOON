package Implementation;

import java.util.Scanner;
//시험 성적
public class testGrade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if (x >= 90) {
			System.out.println("A"); //90 ~ 100점은 A
		} else if (x >= 80) {
			System.out.println("B"); //80 ~ 89점은 B
		} else if (x >= 70) {
			System.out.println("C"); //70 ~ 79점은 C
		} else if (x >= 60) {
			System.out.println("D"); //60 ~ 69점은 D
		} else {
			System.out.println("F"); //나머지 점수는 F
		}

	}
	
}
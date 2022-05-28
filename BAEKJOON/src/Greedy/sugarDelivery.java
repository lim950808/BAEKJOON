package Greedy;

//방법 1: BufferedReader -> 속도가 더 빠름
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
 
public class sugarDelivery {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
 
		if (N == 4 || N == 7) {
			System.out.println(-1);
		}
		else if (N % 5 == 0) {
			System.out.println(N / 5);
		}
		else if (N % 5 == 1 || N % 5 == 3) {
			System.out.println((N / 5) + 1);
		}
		else if (N % 5 == 2 || N % 5 == 4) {
			System.out.println((N / 5) + 2);
		}
		
	}
	
}

//방법 2: Scanner(수학적 접근)
//import java.util.Scanner;
//
//public class sugarDelivery {
//	public static void main(String[] args) {
//    
//		Scanner in = new Scanner(System.in);
//		int N = in.nextInt();
//		
//		if (N == 4 || N == 7) {
//			System.out.println(-1);
//		}
//		else if (N % 5 == 0) {
//			System.out.println(N / 5);
//		}
//		else if (N % 5 == 1 || N % 5 == 3) {
//			System.out.println((N / 5) + 1);
//		}
//		else if (N % 5 == 2 || N % 5 == 4) {
//			System.out.println((N / 5) + 2);
//		}
//		
//	}
//}
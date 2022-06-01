package Greedy;

//��� 1 : [Scanner + Arrays.sort()]
//import java.util.Scanner;
//import java.util.Arrays;
// 
//public class atm {
// 
//	public static void main(String[] args) {
//		
//		Scanner in = new Scanner(System.in);
//		
//		int N = in.nextInt();
//		
//		int[] arr = new int[N];
//		
//		for(int i = 0; i < N; i++) {
//			arr[i] = in.nextInt();
//		}
//		
//		// ���� 
//		Arrays.sort(arr);
// 
// 
//		int prev = 0;	// ���������� ���ð� ������ 
//		int sum = 0;	// ����� ���ð� ���� 
//				
//		for(int i = 0; i < N; i++) {	
//			// ���������� ���ð��� ���� ����� �ɸ��� �ð��� �����ش�.
//			sum += prev + arr[i];
//		    
//			// ���������� �����տ� ���� �ɸ��� �ð��� �����ش�.
//			prev += arr[i];
//		}
//		System.out.println(sum);
//	}
//}

//��� 2 : [Scanner + Counting Sort]
//import java.util.Scanner;
//
//public class atm {
// 
//	public static void main(String[] args) {
// 
//		Scanner in = new Scanner(System.in);
// 
//		int N = in.nextInt();
// 
// 
//		// �Է��� ������ 1 ~ 1000�̹Ƿ� 1001���� index�� �д�.
//		int[] arr = new int[1001];
// 
//		// Counting Sort 
//		while (N-- > 0) {
//			arr[in.nextInt()]++;
//		}
// 
//		int prev = 0;	// ���������� ���ð� ������
//		int sum = 0;	// ����� ���ð� ����
//		
//		for (int i = 0; i < 1001; i++) {
//			
//			// �ش� i index�� 0�� �� �� ���� �ݺ� 
//			while (arr[i]-- > 0) {
//				// ���������� ���ð��� ���� ����� �ɸ��� �ð��� �����ش�.
//				sum += (i + prev);
//				
//				// ���������� �����տ� ���� �ɸ��� �ð��� �����ش�.
//				prev += i;
//			}
//		}
//		System.out.println(sum);
//	}
// 
//}

//��� 3 : [BufferedReader + Counting Sort] => ���� �ð��� ������ �޸𸮵� �� ������. ������ �ڵ� ���̰� ���� ��.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class atm {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		// �Է��� ������ 1 ~ 1000�̹Ƿ� 1001���� index�� �д�.
		int[] arr = new int[1001];
 
		// Counting Sort 
		while (N-- > 0) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
 
		int prev = 0;	// ���������� ���ð� ������
		int sum = 0;	// ����� ���ð� ����
		
		for (int i = 0; i < 1001; i++) {
			
			// �ش� i index�� 0�� �� �� ���� �ݺ� 
			while (arr[i]-- > 0) {
				// ���������� ���ð��� ���� ����� �ɸ��� �ð��� �����ش�.
				sum += (i + prev);
				
				// ���������� �����տ� ���� �ɸ��� �ð��� �����ش�.
				prev += i;
			}
		}
		System.out.println(sum);
	}
 
}
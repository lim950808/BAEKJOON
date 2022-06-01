package Greedy;

//방법 1 : [Scanner + Arrays.sort()]
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
//		// 정렬 
//		Arrays.sort(arr);
// 
// 
//		int prev = 0;	// 이전까지의 대기시간 누적합 
//		int sum = 0;	// 사람별 대기시간 총합 
//				
//		for(int i = 0; i < N; i++) {	
//			// 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
//			sum += prev + arr[i];
//		    
//			// 이전까지의 누적합에 현재 걸리는 시간을 더해준다.
//			prev += arr[i];
//		}
//		System.out.println(sum);
//	}
//}

//방법 2 : [Scanner + Counting Sort]
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
//		// 입력의 범위는 1 ~ 1000이므로 1001개의 index를 둔다.
//		int[] arr = new int[1001];
// 
//		// Counting Sort 
//		while (N-- > 0) {
//			arr[in.nextInt()]++;
//		}
// 
//		int prev = 0;	// 이전까지의 대기시간 누적합
//		int sum = 0;	// 사람별 대기시간 총합
//		
//		for (int i = 0; i < 1001; i++) {
//			
//			// 해당 i index가 0이 될 때 까지 반복 
//			while (arr[i]-- > 0) {
//				// 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
//				sum += (i + prev);
//				
//				// 이전까지의 누적합에 현재 걸리는 시간을 더해준다.
//				prev += i;
//			}
//		}
//		System.out.println(sum);
//	}
// 
//}

//방법 3 : [BufferedReader + Counting Sort] => 가장 시간도 빠르고 메모리도 덜 차지함. 하지만 코드 길이가 제일 김.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class atm {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		// 입력의 범위는 1 ~ 1000이므로 1001개의 index를 둔다.
		int[] arr = new int[1001];
 
		// Counting Sort 
		while (N-- > 0) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
 
		int prev = 0;	// 이전까지의 대기시간 누적합
		int sum = 0;	// 사람별 대기시간 총합
		
		for (int i = 0; i < 1001; i++) {
			
			// 해당 i index가 0이 될 때 까지 반복 
			while (arr[i]-- > 0) {
				// 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
				sum += (i + prev);
				
				// 이전까지의 누적합에 현재 걸리는 시간을 더해준다.
				prev += i;
			}
		}
		System.out.println(sum);
	}
 
}
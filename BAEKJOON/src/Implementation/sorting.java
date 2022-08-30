package Implementation;

import java.io.*;
import java.util.Arrays;
// 수 정렬하기
public class sorting {
	public static void main(String[] args) throws IOException {
		//수의 갯수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		//입력받는 수의 배열
		int [] arr = new int [count];
		
		//임시 저장 변수
		int temp;
		
		for(int i=0; i<count; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
			if(i != arr.length-1) {
				sb.append("\n");
			}
		}
		//첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력
		System.out.println(sb.toString());
	}
}
package Implementation;

import java.util.*;
//최댓값
public class maximum {
  
	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);	
		int [] input = new int[9];
		int max = 0;
		int cnt = 0;
      
		//9개의 서로 다른 자연수
		for(int i=0; i<9; i++) {
			input[i] = sc.nextInt();
		}
      
		for(int i=0; i<9; i++) {
			if(input[i] > max) {
				max = input[i];
				cnt = i+1;
			}
		}
      
		//9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지 출력
		System.out.println(max); //최댓값
		System.out.println(cnt); //그 최댓값이 몇 번재 수인지
	}
  
}
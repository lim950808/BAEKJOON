package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//구구단
public class multiplicationTable {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //첫째 줄에 N이 주어진다.
		
		//N은 1보다 크거나 같고, 9보다 작거나 같다.
		for(int i=1; i<=9; i++) {
			//N*1부터 N*9까지 출력
			System.out.println(N + " * " + i + " = " + (N * i));
		}
		
	}

}
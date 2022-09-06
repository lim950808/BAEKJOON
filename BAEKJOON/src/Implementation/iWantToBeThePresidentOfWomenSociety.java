package Implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//부녀회장이 될테야
public class iWantToBeThePresidentOfWomenSociety {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine()); //T만큼 테스트 진행
		int[][] apart = new int[15][15]; //[k][n] //1 ≤ k, n ≤ 14
		
		//아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
		for(int i=0 ; i<15 ; i++) {
			apart[i][1] = 1; //k층 1호는 모두 1명
			apart[0][i] = i; //0층 1호부터 14호까지는 모두 1명
		}
		
		for(int k=1 ; k<15 ; k++) { //1층부터 14층 까지 반복
			for( int n=2 ; n<15 ; n++) { //2호부터 14호까지 반복
				apart[k][n] = apart[k][n-1] + apart[k-1][n]; //공식대입
			}
		}
		
		for(int i=0 ; i<T; i++) {
			
			int K = Integer.parseInt(br.readLine()); //아파트 층 수
			int N = Integer.parseInt(br.readLine()); //아파트 호 수
			//k층에 n호에는 몇 명이 살고 있는지 출력
			bw.write(apart[K][N] + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
	
}
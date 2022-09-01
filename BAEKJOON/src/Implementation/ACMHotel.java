package Implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
// ACM 호텔
public class ACMHotel {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine()); // T만큼 테스트 진행
		
		for(int i=0; i<T; i++) {
			String[] ACM = br.readLine().split(" ");
			
			int H = Integer.parseInt(ACM[0]); // 호텔 층 수
			int W = Integer.parseInt(ACM[1]); // 층마다 방 수
			int N = Integer.parseInt(ACM[2]); // N번째 손님
			
			int floor = N % H; // 층 = 나머지 
			int room = N / H + 1; // 호수 = 몫 + 1
			
			if(N % H == 0) { // 나머지가 0인 경우 호텔의 꼭대기 층에 방 배정
				floor = H * 100; 
				room = N / H;
			}else { // 아닐 경우
				floor = (N % H) * 100;
				room = N / H + 1;
			}
			//N번째 손님에게 몇 호의 방을 배정하는지 구하는 문제
			bw.write(floor + room + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
		
	}
	
}
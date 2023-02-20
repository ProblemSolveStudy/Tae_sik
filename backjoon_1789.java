import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_1789 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		// int 의 양을 넘기때문에 long으로 타입을 잡아주었다.
		long S = Long.parseLong(br.readLine());
		
		long sum = 0;
		int count = 0;
		// count라서 1부터 더하는것으로 횟수를 잡았고
		// 해당 숫자를 넘지 않아야 하기때문에 넘은 횟수 직전인
		// -1로 잡아주었다.
		for(int i = 1; i < S; i++) {
			while( S > sum) {
				sum += i;
				count++;
				break;
			}
		}
		System.out.println(count-1);
	}
}

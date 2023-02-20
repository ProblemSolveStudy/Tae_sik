import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_5585 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = 1000-Integer.parseInt(br.readLine());
		int[] arr = {500, 100, 50, 10, 5, 1};
		 
		
		int count = 0; 
		for(int coin : arr) {
			if(coin > N) {
				continue;
			}
			count += N / coin;
			N %= coin;
		}
		System.out.println(count);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_Suger_delivery {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		if( N == 7 || N == 4) {
			System.out.println(-1);
		} else if( N % 5 == 0) {
			System.out.println(N/5);
		} else if( N % 5 == 1 || N % 5 == 3) {
			System.out.println((N/5)+1);
		} else if( N % 5 == 2 || N % 5 == 4) {
			System.out.println((N/5)+2);
		}
	}

}

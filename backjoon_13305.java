import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjoon_13305 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[] oil = new long[N];
		long[] km = new long[N-1];
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N - 1; i++) {
			km[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			oil[i] = Long.parseLong(st.nextToken());
		}
		
		
		long min_oil = oil[0]; // 고정 될 수 있는 값
		long sum = 0;
		
		for(int i = 0; i < N - 1; i++) {
			if(min_oil > oil[i]) {
				min_oil = oil[i];
			} 
			sum += (min_oil*km[i]);
		}
		System.out.println(sum);
	}

}

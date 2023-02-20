import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_10162 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int time = Integer.parseInt(br.readLine());
		int[] arr = {300, 60, 10 };
		int[] cnt = new int[3];
		
		if(time % 10 != 0) {
			System.out.println(-1);
			return;
		} 
		for(int i = 0; i < arr.length; i++) {
			cnt[i] = time / arr[i]; 
			time -= arr[i]*cnt[i];
			System.out.printf(cnt[i]+ " ");
			}
	}
}

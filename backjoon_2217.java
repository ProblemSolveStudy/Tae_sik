import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class backjoon_2217 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k =Integer.parseInt(br.readLine());
		int[] arr = new int[k];
		
		for(int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < k; i++) {
			max = Math.max(max, arr[i]*(k-i));
		}
		System.out.println(max);
	}

}

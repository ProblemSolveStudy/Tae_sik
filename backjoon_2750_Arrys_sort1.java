import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class backjoon_2750_Arrys_sort1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr =new int[N];
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr); // Arrays.sort를 이용한 문제
		
		for(int val : arr) {
			System.out.println(val);
		}
	}
}

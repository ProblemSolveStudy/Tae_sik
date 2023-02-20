import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class backjoon_10610 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		char[] arr = S.toCharArray();
		Arrays.sort(arr);
		int len = arr.length;
		
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for(int i = len - 1; i >= 0; i--) {
			int num = arr[i] - '0';
			sum += num;
			sb.append(num);
		}
		
		
		if(arr[0] != '0' || sum % 3 != 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(sb.toString());
	}
}

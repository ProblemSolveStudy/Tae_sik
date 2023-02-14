import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_9498 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(90 <= N && N <= 100 ) {
			System.out.println("A");
		} else if(80 <= N && N < 90) {
			System.out.println("B");
		} else if(70 <= N && N < 80) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		// 이번 문제는 if조건문으로 범위를 구성하는 문제이다.
		// && 는 "그리고" 라는 뜻으로 조건문안의 범위를 나타낼수있다.
	}

}

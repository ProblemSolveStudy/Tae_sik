import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_15486 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];
        int[] T = new int[n + 1];
        int[] P = new int[n + 1];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = Math.max(sum, dp[i]);

            int day = i + T[i];
            if (day <= n) {
                dp[day] = Math.max(dp[day], sum + P[i]);
            }
        }
        System.out.println(sum);
    }
}
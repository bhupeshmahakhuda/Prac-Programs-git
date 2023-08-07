package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicCow {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final int MAX_DAYS= 50;

    public static void main(String[] args) throws IOException {
        String[] line = br.readLine().split(" ");
        final int C = Integer.parseInt(line[0]);
        final int N =  Integer.parseInt(line[1]);
        final int M =  Integer.parseInt(line[2]);

        // The dp table.
        long[][] dp = new long[MAX_DAYS + 1][C + 1];

        // Count the initial frequency of farms of different sizes
        for (int i = 0; i < N; i++) {
            int cows = Integer.parseInt(br.readLine());
            dp[0][cows]++;
        }

        for (int day = 0; day < MAX_DAYS; day++) {
            // For all farm sizes between 1 and `C`, double the number of cows.
            for (int i = 1; i <= C; i++) {
                if (i <= C / 2) {
                    // Cow count on farm with size `i` doubled, but the number of farms did not.
                    dp[day + 1][i * 2] += dp[day][i];
                } else {
                    // The number of cows per farm on the farm with size `i` exceeds the
                    // permitted limit, so double the number of farms.
                    dp[day + 1][i] += 2 * dp[day][i];
                }
            }
        }

        // Answer each query
        for (int i = 0; i < M; i++) {
            int day = Integer.parseInt(br.readLine());
            System.out.println(query(dp, day));
        }
    }
    private static long query(long[][] dp, int day) {
        long farms = 0;
        long[] frequencies = dp[day];
        for (int i = 0; i < frequencies.length; i++) {
            farms += frequencies[i];
        }
        return farms;
    }
}

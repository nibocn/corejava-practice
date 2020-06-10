package me.nibo.corejava.v1ch03.lotteryarray;

@SuppressWarnings({ "PMD.UseUtilityClass" })
public class LotteryArray {

    @SuppressWarnings({ "PMD.UnusedFormalParameter", "PMD.SystemPrintln" })
    public static void main(String[] args) {
        final int nmax = 10;

        int[][] odds = new int[nmax + 1][];
        for (int n = 0; n <= nmax; n++) {
            odds[n] = new int[n + 1];
        }

        for (int n = 0; n < odds.length; n++) {
            for (int k = 0; k < odds[n].length; k++) {
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++) {
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                }
                odds[n][k] = lotteryOdds;
            }
        }

        for (int[] row : odds) {
            for (int odd : row) {
                System.out.printf("%4d", odd);
            }
            System.out.println();
        }
    }

}

package me.nibo.corejava.v1ch03.retirement;

import java.util.Scanner;

/**
 * Retirement
 * @author NiBo
 */
@SuppressWarnings({"PMD.UseUtilityClass"})
public class Retirement {

    @SuppressWarnings({ "PMD.UnusedFormalParameter", "PMD.SystemPrintln" })
    public static void main(String[] args) {
        Scanner in = null;
        in = new Scanner(System.in);

        System.out.println("你需要多少钱退休？");
        double goal = in.nextDouble();

        System.out.println("你每年准备存多少钱？");
        double payment = in.nextDouble();

        System.out.println("每年的利率（%）：");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("预计在 " + years + " 年后可以退休。");
    }
}

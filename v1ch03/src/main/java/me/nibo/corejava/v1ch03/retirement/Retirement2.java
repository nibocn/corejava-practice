package me.nibo.corejava.v1ch03.retirement;

import java.util.Scanner;

/**
 * Retirement2
 * @author NiBo
 */
@SuppressWarnings({"PMD.UseUtilityClass"})
public class Retirement2 {

    @SuppressWarnings({ "unused", "PMD.SystemPrintln" })
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("你每年准备存多少钱？");
        double payment = in.nextDouble();

        System.out.println("每年的利率（%）：");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;
        String input;

        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            years++;

            System.out.printf("%d 年后，你的余额是： %,.2f%n", years, balance);

            System.out.println("可以退休了？（Y/N）");
            input = in.next();
        } while ("n".equalsIgnoreCase(input));
    }
}

import java.lang.Math;
import java.util.Scanner;

public class accprog {

    public static void main(String args[]) {
        int ant, bal, acctype, amount, choice, months;
        choice = 0;
        double inter = 0.05;

        System.out.println("WELCOME TO RAUNAK BANK");
        System.out.println("Enter your account number:");
        Scanner sc = new Scanner(System.in);
        ant = sc.nextInt();
        System.out.println("Thanks for choosing RAUNAK BANK. Your account number is " + ant);
        System.out.println("Enter your initial account balance:");
        bal = sc.nextInt();
        System.out.println("Initial Balance " + bal);
        System.out.println("Enter your account operating monthss\n");
        months = sc.nextInt();
        System.out.println("Enter your account type: 1=current 2=savings\n");
        acctype = sc.nextInt();

        if (acctype != 1 && acctype != 2) {
            System.out.println("Account type not recognized");
        } else if (acctype == 1) {

            while (choice != 5) {
                System.out.println("\n 1.Withdraw \n 2.Deposit \n 3.Show Balance \n 4.Interest Calculation \n 5.Exit");
                System.out.println("\n Enter your choice: ");
                choice = sc.nextInt();
                current cr = new current(bal);

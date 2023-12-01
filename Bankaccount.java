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
                switch (choice) {
                    case 1:
                        System.out.println("\n Enter amount to withdraw");
                        amount = sc.nextInt();
                        bal = cr.withdrawc(amount);
                        break;
                    case 2:
                        System.out.println("\n Enter amount to deposit");
                        amount = sc.nextInt();
                        bal = cr.depositc(amount);
                        break;
                    case 3:
                        System.out.println("\n Displaying your balance");
                        bal = cr.displayc();
                        break;
                    case 4:
                        System.out.println("Don't expect any interest from current account.");
                        break;
                    default:
                        break;
                }
            }
        } else {
            saving ssr = new saving(inter, months, bal);
            while (choice != 5) {
                System.out.println("\n 1.Withdraw \n 2.Deposit \n 3.Show Balance \n 4.Interest Calculation \n 5.Exit");
                System.out.println("\n Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("\n Enter amount to withdraw");
                        amount = sc.nextInt();
                        ssr.withdrws(amount);
                        break;
                    case 2:
                        System.out.println("\n Enter amount to deposit");
                        amount = sc.nextInt();
                        ssr.deposits(amount);
                        break;
                    case 3:
                        System.out.println("\n Displaying your balance");
                        ssr.display();
                        break;
                    case 4:
                        double interest_amount = ssr.interest_calculate();
                        System.out.format("Interest Amount: %.2f",interest_amount);
                        break;
                    default:
                        break;
                }
            }
        }
        sc.close();
    }

    public static class account {
        int account_no;
        int account_balance;

        public account(int account_no, int account_balance) {
            this.account_balance = account_balance;
            this.account_no = account_no;
                            }
        public int deposit(int amount) {
            account_balance = account_balance + amount;
            System.out.println("Deposited amount is " + amount);
            return account_balance;
        }

        public int withdraw(int amount) {
            account_balance = account_balance - amount;
            System.out.println("Withdraw amount is " + amount);
            return account_balance;
        }

        public int display() {
            System.out.println("Balance of the account is: " + account_balance);
            return account_balance;
        }
    }

    public static class saving extends account {
        public double interest;
        public int months;

        public saving(double interest, int months, int account_balance) {
            super(account_balance, account_balance);
            this.interest = interest;
            this.months = months;
        }

        public double interest_calculate() {
            double interest_amount,interest_amount_total;
            // interest_amount_total = account_balance * (Math.pow((1 + (interest / 4)), (4 * months)));
            interest_amount=(account_balance*months*interest)/365;
            interest_amount_total=0;//not used here
            // interest_amount=interest_amount_total-account_balance;
            return interest_amount;
        }

        public int withdrws(int amount) {
            if ((account_balance-amount) > 1000) {
                super.withdraw(amount);
            } else {
                System.out.println("Minimum account balance is reached, earn some money");
            }
            return account_balance;

        }

        public int deposits(int amount) {
            super.deposit(amount);
            return account_balance;
        }
    }

    public static class current extends account {
        public current(int account_balance) {
            super(account_balance, account_balance);
        }

        public int withdrawc(int amount) {
            if (amount > 100000) {
                System.out.println("The limit of withdrawal is reached");
            } else {
                super.withdraw(amount);
            }
            return account_balance;
        }

        public int depositc(int amount) {
            super.deposit(amount);
            System.out.println("Amount deposited " + amount);
            return account_balance;
        }

        public int displayc() {
            int b;
            b = super.display();
            return b;
        }
    }
}

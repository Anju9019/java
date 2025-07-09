public class BankAccount {
    public static void credit(double credit, double[] balance) {
        if (credit > 0.0) {
            balance[0] += credit;
            System.out.println("The balance is: " + balance[0]);
        } else {
            System.out.println("The amount must be greater than 0");
        }
    }

    public static void debit(double debit, double[] balance) {
        System.out.println("Debit started");
        balance[0] -= debit;
        System.out.println("The balance is: " + balance[0]);
        System.out.println("Debit ended");
    }
}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
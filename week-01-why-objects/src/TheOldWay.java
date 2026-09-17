/*
 * Week 1 - Why objects
 *
 * This is the version the course argues against. It compiles, it runs, and
 * it is wrong in three ways that get worse as a program grows:
 *
 *   1. The withdrawal rule is written twice and nothing enforces a third copy.
 *   2. The data is reachable from anywhere, so any line can change it.
 *   3. balances[i] and owners[i] are the same account only by convention.
 *
 * Run it and read the last block of output.
 */
public class TheOldWay {

    private static double[] balances = { 500.00, 1200.00, 30.00 };
    private static String[] owners   = { "Ada Lovelace", "Alan Turing", "Grace Hopper" };

    public static void main(String[] args) {
        System.out.println("=== The old way ===");
        printAll();

        System.out.println();
        System.out.println("Withdraw 200 from account 0: " + withdraw(0, 200.00));
        System.out.println("Withdraw 900 from account 0: " + withdraw(0, 900.00));
        printAll();

        System.out.println();
        System.out.println("Transfer 100 from account 1 to account 2: " + transfer(1, 2, 100.00));
        printAll();

        // No rule was consulted here. This is a valid line of Java and it
        // empties an account past zero. Nothing in the program can stop it.
        System.out.println();
        System.out.println("And then somebody writes balances[1] -= 5000:");
        balances[1] -= 5000.00;
        printAll();
    }

    static boolean withdraw(int index, double amount) {
        if (amount <= 0 || amount > balances[index]) {
            return false;
        }
        balances[index] -= amount;
        return true;
    }

    static boolean transfer(int from, int to, double amount) {
        // The same rule as withdraw, written a second time. When the bank
        // allows an overdraft next year, both copies have to be found.
        if (amount <= 0 || amount > balances[from]) {
            return false;
        }
        balances[from] -= amount;
        balances[to]   += amount;
        return true;
    }

    static void printAll() {
        for (int i = 0; i < balances.length; i++) {
            System.out.printf("  %s: %.2f EUR%n", owners[i], balances[i]);
        }
    }
}
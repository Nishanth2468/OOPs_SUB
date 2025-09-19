// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATMApp {
    private static final int CORRECT_PIN = 1234;
    private double balance = 5000;

    public void withdraw(int enteredPIN, double amount) throws SecurityException, InsufficientBalanceException {
        if (enteredPIN != CORRECT_PIN) {
            throw new SecurityException("Invalid PIN!");
        }
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        ATMApp atm = new ATMApp();
        try {
            atm.withdraw(1111, 2000); // Invalid PIN
        } catch (SecurityException se) {
            System.out.println("Security Error: " + se.getMessage());
        } catch (InsufficientBalanceException ibe) {
            System.out.println("Transaction Error: " + ibe.getMessage());
        } finally {
            System.out.println("ATM Transaction Completed");
        }
    }
}

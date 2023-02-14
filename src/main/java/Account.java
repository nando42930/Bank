/**
 *  Account associated to a customer.
 */
public class Account {
    private int id;
    private double balance;


    /**
     * @param id
     * @param balance
     */
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    /**
     * @return id of the account
     */
    public int getId() {
        return id;
    }

    /**
     * @return current balance of this account
     */
    public double getBalance() {
        return balance;
    }
}
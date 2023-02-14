import java.util.ArrayList;
import java.util.Collection;

/**
 *  Client data.
 */
public class Client {
    private String name;
    private int age, numberChildren, accounts;
    private double debt;
    private final ArrayList<Account> bankAccounts = new ArrayList<>();


    /**
     * @param name of this client
     * @param age of this client
     * @param numberChildren client has
     * @param accounts client has
     * @param debt associated to client's account(s)
     */
    public Client(String name, int age, int numberChildren, int accounts, double debt) {
        this.name = name;
        this.age = age;
        this.numberChildren = numberChildren;
        this.accounts = accounts;
        this.debt = debt;
    }

    /**
     * @return client's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return client's age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param account to be associated with this client
     * @return always <code>false</code>
     */
    public boolean addAccount(Account account) {
        bankAccounts.add(account);
        return true;
    }

    /**
     * @return
     */
    public Collection<Account> getBankAccounts() {
        return bankAccounts;
    }
}
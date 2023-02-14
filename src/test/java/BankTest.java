import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankTest {

    /**
     *
     */
    @Test
    void testAddAccountToClient() {
        Client client = new Client("Diogo", 26, 0, 1,0);
        Account account = new Account(1, 15);

        assertAll(
                ()->assertTrue(client.addAccount(account)),
                ()->assertTrue(client.getBankAccounts().contains(account))
        );
    }
}
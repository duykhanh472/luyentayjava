import java.util.ArrayList;

public class BankingManagement {
    ArrayList<Account> listAccount;

    public BankingManagement(ArrayList<Account> listAccount) {
        this.listAccount = listAccount;
    }

    public void addAccount(String username, int password) {
        Account newAccount = new Account(username, password, 0);
        listAccount.add(newAccount);
    }

    public void removeAccount(Account account) {
        listAccount.remove(account);
    }

    public Account getAccount(String username) {
        return listAccount.stream().filter(acc -> username.equals(acc.getUsername())).findFirst().orElse(null);
    }
}
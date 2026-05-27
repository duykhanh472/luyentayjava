public class Account {

    String username;
    int password;
    int totalAmount;

    public Account(String username, int password, int totalAmount) {
        this.username = username;
        this.password = password;
        this.totalAmount = totalAmount;
    }

    public String getUsername() {
        return this.username;
    }

    public int getTotalAmount() {
        return this.totalAmount;
    }


    public void deposit(int amount) {
        this.totalAmount += amount;
    }

    public void withdraw(int amount) {
        this.totalAmount -= amount;
    }

    public int showBalance() {
        return totalAmount;
    }

    public boolean checkPassword(int enteredPassword) {
        return (password == enteredPassword);
    }
}

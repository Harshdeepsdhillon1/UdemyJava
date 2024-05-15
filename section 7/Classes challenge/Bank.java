public class Bank {
    private String account_number;
    private double account_balance;
    private String customer_name;
    private String email;
    private String phone_number;

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAccount_number() {
        return account_number;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }
    public void addDeposit(double depositAmount){
        account_balance+=depositAmount;
        System.out.println("Deposit of $" +depositAmount+" made. New balance is $"+this.account_balance);
    }
    public void withdrawDeposit(double withdrawAmount){
        if (account_balance - withdrawAmount < 0){
            System.out.println("Insufficient funds in the account. You only have $" + account_balance+ "in your account");
        }else {
            account_balance-=withdrawAmount;
            System.out.println("Withdraw of $" +withdrawAmount+" made. Remaining balance is $"+this.account_balance);
        }
    }
}

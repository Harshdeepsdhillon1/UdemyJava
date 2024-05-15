public class Main {
    public static void main(String[]args){
        Bank harshsAccount = new Bank();
        harshsAccount.setAccount_number("12345");
        harshsAccount.setEmail("harshdeepsdhillon@gamil.com");
        harshsAccount.setAccount_balance(3000);
        harshsAccount.setCustomer_name("Harshdeep Singh Dhillon");
        harshsAccount.setPhone_number("8054924984");
        harshsAccount.withdrawDeposit(1000);
        harshsAccount.addDeposit(2000);
        harshsAccount.withdrawDeposit(500);

    }

}

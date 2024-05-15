public class Main {
    public static void main(String []args){
        Customer Harsh = new Customer("Harshdeep Singh", 1000.0, "Harshdeepsdhillon@gmail.com");
        System.out.println(Harsh.getCreditLimit());
        System.out.println(Harsh.getName());
        System.out.println(Harsh.getEmail());

        Customer Nobody = new Customer();
        System.out.println(Nobody.getCreditLimit());
        System.out.println(Nobody.getName());
        System.out.println(Nobody.getEmail());

        Customer SecondCustomer = new Customer("Second Customer", "customer2@abc.com");
        System.out.println(SecondCustomer.getName());
        System.out.println(SecondCustomer.getEmail());
    }
}

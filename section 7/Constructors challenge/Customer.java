public class Customer {
        private String name;
        private double creditLimit;
        private String email;


        public Customer(){
            this("Nobody", "Nobody@xyz.com");//Default values
        }
    public Customer(String name, String email) {
        this(name, 1000, email);//this constructor is calling the below one
        //and giving some default values if main does not give it.
    }

    public Customer(String name, double creditLimit, String email){
            this.name = name;
            this.email = email;
            this.creditLimit = creditLimit;
        }


        public String getName(){
            return name;
        }
        public double getCreditLimit(){
            return creditLimit;
        }
        public String getEmail(){
            return email;
        }
}


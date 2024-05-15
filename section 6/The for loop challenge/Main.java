public class Main {
    public static void main(String []args){
        int primeCount = 0;
        for (int range=0; range <=20; range++){
            if (isPrime(range) == true){
                primeCount++;
                System.out.println(range+ " is a Prime number.");
                if (primeCount == 3){
                    break;
                }
            }
        }
        System.out.println("There were "+primeCount+" prime numbers between 0 to 20");
        //System.out.println("0 is "+ (isPrime(0) ? "": "NOT ") + "a prime number") ;
        //System.out.println("2 is "+ (isPrime(2) ? "": "NOT ") + "a prime number") ;
        //System.out.println("3 is "+ (isPrime(3) ? "": "NOT ") + "a prime number") ;
        //System.out.println("17 is "+ (isPrime(17) ? "": "NOT ") + "a prime number") ;
        //System.out.println("10 is "+ (isPrime(10) ? "": "NOT ") + "a prime number") ;

    }

    public static boolean isPrime(int wholenumber){
        if (wholenumber <= 2){
            return wholenumber == 2;
        }
        for (int divisor = 2; divisor < wholenumber/2; divisor++){
            if(wholenumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {

        printDayOfTheWeek(0);
        printDayOfTheWeek(4);
        for (double rate = 2.0; rate <= 5.0; rate++){
            double interestAmount = calculateInterest(10000, rate);
            System.out.println("The total interest amount for 10000 at "+ rate+"% is "+interestAmount);
        }
        for (double rate = 7.5; rate <= 10.0; rate+=0.25){
            double interestAmount = calculateInterest(100, rate);
            System.out.println("The total interest amount for 100 at "+ rate+"% is "+interestAmount);
        }
    }
    public static void printDayOfTheWeek(int day){
        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Value not found");
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}

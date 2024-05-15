import java.util.Scanner;

public class Main {
    public static void main (String []args){
    Scanner scanner = new Scanner(System.in);
    int counter = 1;
    //int sum = 0;
      double sum = 0; //variation for double
    while (counter<=5) {
        System.out.println("Enter a number " + counter + ": ");
        String nextNumber = scanner.nextLine();
        try {
            //int number = Integer.parseInt(nextNumber);
            double number = Double.parseDouble(nextNumber);
            counter++;
            sum += number;
        } catch (NumberFormatException nfe){
            System.out.println("Invalid Number");
        }

    }
    System.out.println("The Sum of 5 numbers is " +sum);
    }
}

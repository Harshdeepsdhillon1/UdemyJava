import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean isInt = true;
        while (isInt){
            System.out.println("Enter a number, or press any character to quit");
            String nextNum = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNum);
                if (number < min){
                    min = number;
                }
                if (number > max){
                    max = number;
                }
                //how do I find the value of the minimum number entered?


            }catch (NumberFormatException nfe){
                System.out.println("Thanks for playing. Exiting the loop.");
                System.out.println("Max number was " +max);
                System.out.println("Min number was " +min);
                isInt = false;
            }
        }
    }
}

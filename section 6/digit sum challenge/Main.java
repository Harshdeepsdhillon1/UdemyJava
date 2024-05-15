public class Main {
    public static void main(String []args){
        System.out.println("Sum = "+ sumDigits(100));
        System.out.println("Sum = "+ sumDigits(382));
        System.out.println("Sum = "+ sumDigits(1234));
        System.out.println("Sum = "+ sumDigits(-100));

    }
    public static int sumDigits(int number) {
        if (number < 0){
            return -1;
        }
        int sum = 0;
        while (number > 9){
            sum += (number % 10); //sum = sum+(number%10)
            number=number/10;
        }
        sum+=number;
        return sum;
    }
}
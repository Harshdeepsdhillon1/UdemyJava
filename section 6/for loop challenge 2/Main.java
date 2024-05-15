public class Main {
    public static void main(String []args){
        int total = 0;
        int count = 0;
        for (int i=0;i<=1000;i++){
            if (isDivisibleBy3and5(i)){
                System.out.println(i +" is divisible by both 3 and 5.");
                count++;
                total = count * 15;
                if (count==5){
                    System.out.println("Found 5 number divisible by 3 and 5. Exiting loop");
                    break;
                }
            }
        }
        System.out.println("Total of all the numbers divisible by 3 and 5 are " + total);
    }
    public static boolean isDivisibleBy3and5(int num){
        if (num == 0){
            num = 1;
        }
        return num % 3 == 0 && num % 5 == 0;

    }

}

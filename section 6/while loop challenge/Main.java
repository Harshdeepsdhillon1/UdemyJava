public class Main {
    public static void main(String []args){
        int num = 5;
        int even_count = 0;
        int odd_count = 0;
        while (num < 20){
            num++;
            if (isEven(num)){
                System.out.println("Found an even Number "+num);
                even_count++;
                if (even_count == 5){
                    break;
                }
            }
            else {
                odd_count++;
                System.out.println("Found an odd number "+num);
            }
        }
        System.out.println("Total even numbers found: "+even_count );
        System.out.println("Total odd numbers found: "+odd_count );
    }
    public static boolean isEven(int even_num){
        return even_num % 2 == 0;
    }
}

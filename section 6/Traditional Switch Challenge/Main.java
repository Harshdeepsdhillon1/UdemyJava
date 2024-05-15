public class Main {
    public static void main(String[] args){
        String nato_alpha = "E";
        give_nato_message(nato_alpha);
    }
    public static void give_nato_message(String nato_alpha){
        switch (nato_alpha){
            case "A":
                System.out.println("Apple");
                break;
            case "B":
                System.out.println("Ball");
                break;
            case "C":
                System.out.println("Cat");
                break;
            case "D":
                System.out.println("Dog");
                break;
            case "E":
                System.out.println("Elephant");
                break;
            default:
                System.out.println("Please provide a String character");
                break;
        }
    }
}

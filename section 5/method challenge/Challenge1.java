public class Challenge1 {
        public static void main(String[] args){
            int highScorePostion = calculateHighScore(1500);
            displayHighScorePosition("Harsh", highScorePostion);

            highScorePostion = calculateHighScore(500);
            displayHighScorePosition("Sp", highScorePostion);
        }
    public static void displayHighScorePosition(String name, int highScorePostion){
        System.out.println(name + " managed to get on position " +highScorePostion +" in the high score list.");
    }
    //Making more readable


    public static int calculateHighScore(int playerScore){
            int position = 4;
          if (playerScore >= 1000){
              position = 1;
          } else if (playerScore >= 500) {
              position = 2;
          } else if (playerScore >= 100 ) {
              position = 3;
          }
          return position;
    }
}

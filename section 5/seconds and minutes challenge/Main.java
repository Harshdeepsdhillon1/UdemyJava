public class Main {
    public static void main(String[]args){
       System.out.println(getDurationString(7201));
       System.out.println(getDurationString(100,150));
        System.out.println(getDurationString(-100,150));
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Please provide a postive integer value for seconds(" +seconds+")";
        }
        return getDurationString(seconds/60, seconds%60);
    }
    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0){
            return "Please provide a postive integer value for minutes(" +minutes+")";
        }
        if (seconds<=0 || seconds>=59){
            return "Invalid value for seconds ("+seconds+"), must be between 0 and 59.";
        }
        int hours = minutes/60;
        int remainingMinutes = minutes % 60;
        //int remainingSeconds = seconds % 60;
        return hours + " hours " + remainingMinutes + " minutes " + seconds + " seconds ";
    }
}

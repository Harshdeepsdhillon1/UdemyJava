public class Main {

        public static void main(String[] args){
        convertToCentimeters(22);
        convertToCentimeters(6, 2);
        }
        public static double convertToCentimeters(int heightInInches){
                double heightInCm = heightInInches * 2.54;
                System.out.println("Height from Inches to Cm is " + heightInCm);
                return heightInCm;
        }
        public static double convertToCentimeters(int heightInFeet, int heightInInches){

                //double heightInCm = ((heightInFeet * 12) + heightInInches)*2.54;
                //System.out.println("Height from Feet & Inches to Cm is " + heightInCm);
                //return heightInCm;
                return convertToCentimeters((heightInFeet*12)+heightInInches);
        }




}

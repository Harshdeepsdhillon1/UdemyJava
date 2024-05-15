public class Main {
    public static void main (String[] args){
        SalariedEmployee Faraz = new SalariedEmployee("Faraz", "04-02-1990", "17-05-2020", 60000, false);
        System.out.println(Faraz);
        System.out.println("Faraz's biweekly paycheck is $" + Faraz.collectPay());

        Faraz.retire();
        System.out.println("Faraz's biweekly paycheck after retirement is $" + Faraz.collectPay());
        HourlyEmployee Harsh = new HourlyEmployee("Harsh", "01-01-2004",  "07-05-2023",17.5);
        System.out.println(Harsh);
        System.out.println("Harsh's biweekly paycheck is $" +Harsh.collectPay());
        Harsh.getDoublePay();


    }
}

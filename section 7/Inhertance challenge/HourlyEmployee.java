public class HourlyEmployee extends Employee{
    private  double hourlyPay;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPay) {
        super(name, birthDate, hireDate);
        this.hourlyPay = hourlyPay;
    }
    @Override
    public double collectPay(){
        return 40 * hourlyPay;
    }
    public void getDoublePay(){
        hourlyPay = hourlyPay*2;
        System.out.println(name + " makes $" + hourlyPay + "/hourly on holidays");
    }
    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPay=" + hourlyPay +
                "} " + super.toString();
    }
}

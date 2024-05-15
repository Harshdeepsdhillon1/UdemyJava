public class SalariedEmployee extends Employee{
    private double getAnnualSalary;
    private boolean isRetired;


    public SalariedEmployee(String name, String birthDate, String hireDate, double getAnnualSalary , boolean isRetired) {
        super(name, birthDate, hireDate);
        this.getAnnualSalary = getAnnualSalary;
        this.isRetired = isRetired;
    }
    @Override
    public double collectPay(){
        double payCheck = getAnnualSalary / 26;
        if (isRetired){
            payCheck = payCheck / 2;
        }
        return (int) payCheck;
    }
    public void retire(){
        terminate("12/12/2024");
        isRetired = true;
        if (isRetired) {
            System.out.println(name + " retired on " + endDate);
        }
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "getAnnualSalary=" + getAnnualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}

public class Employee extends Worker {
    private long employeeID;
    private String hireDate;
    private static int employeeNo;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;
        this.employeeID = Employee.employeeNo++; //Employee number would automatically increase when we create a new employee
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

public class Worker {
    protected String name;
    private String birthDate;
    protected String endDate;

    public Worker(){

    }
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(int age){
        System.out.println(name + "is" + age + "years old");
        return age;
    }

    public double collectPay(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println(name + " was terminated on " + endDate);
    }



}

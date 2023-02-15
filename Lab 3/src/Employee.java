public class Employee {
    private double Salary;
    private String name;

    public Employee(){
        this.name="Amir";
        this.Salary=500000d;
    }
    public Employee(String name,double salary){
        this.name=name;
        this.Salary=salary;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return Salary;
    }

}

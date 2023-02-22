public class Employee extends Persion{
    private double Salary;
    private String name;
    private int id;

    /*public Employee(){
        this.name="Amir";
        this.Salary=500000d;
        this.id=5927;
    }*/
    public Employee(String name,int id,double salary){
        this.name=name;
        this.Salary=salary;
        this.id=id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public double getSalary()
    {
        return Salary;
    }

}

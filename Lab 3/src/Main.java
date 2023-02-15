public class Main {
    public static void main(String[] args) {
        Employee print = new Employee();
        Employee print1 = new Employee("Hamza",600000);
        System.out.println("Name:"+print.getName()+"\n"+"Salary:"+print.getSalary());
        System.out.println("Name:"+print1.getName()+"\n"+"Salary:"+print1.getSalary());

    }
}
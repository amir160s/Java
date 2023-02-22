public class Main {
    public static void main(String[] args) {
       // Employee print1 = new Employee("Hamza",5927,600000);
        Employee print=new Employee("Enter Name",0000,000000);
        print.setName("Amir");
        print.setId(5927);
        print.setSalary(7000000.000);

        //System.out.println("Name:"+print1.getName()+"\t"+"ID:"+print1.getId()+"\t"+"Salary:"+print1.getSalary());
        System.out.println("Name:"+print.getName()+"\n"+"Age:"+print.age+"\n"+"ID:"+print.getId()+"\n"+"Salary:"+print.getSalary());

    }
}
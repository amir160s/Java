public class Main {
    public static void main(String[] args) {

        Car obj = new Car();
        obj.move();
        Boat obj1=new Boat();
        obj1.move();

        System.out.println("""


                """);
        System.out.println("Interface");
        Circle c=new Circle();
        c.draw();
        Line l= new Line();
        l.draw();

        System.out.println("""


                """);
        System.out.println("FirstInterface");
        FirstInterface f = new DemoClass();
        f.method1();

        System.out.println("""


                """);
        System.out.println("SecondInterface");
        SecondInterface s = new DemoClass();
        s.method2();

        System.out.println("""


                """);
        System.out.println("FirstInterface and SecondInterface By Child Class");
        DemoClass d = new DemoClass();
        d.method1();
        d.method2();

        System.out.println("""


                """);
        System.out.println("FirstInterface and SecondInterface By Child Interface");
    }
}
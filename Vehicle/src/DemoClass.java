public class DemoClass implements FirstInterface,SecondInterface{
    @Override
    public void method1() {
        System.out.println("Method of FirstInterface");
    }

    @Override
    public void method2() {
        System.out.println(" Method of SecondInterface");
    }
}

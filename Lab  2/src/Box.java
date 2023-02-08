public class Box {
    int height,width,length;
    static void calculate_area(int height,int width,int length)
    {
        System.out.println("Area="+height * width * length);
    }
    static void calculate_area(int height,int width)
    {
        System.out.println("Area 2="+height * width);
    }
    void display(int height,int width,int length)
    {
        System.out.println("Height="+height+"\n"+"Width="+width+"\n"+"Length="+length);
    }
}

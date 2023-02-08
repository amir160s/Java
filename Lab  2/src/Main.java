public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.width=6;
        box.length=5;
        box.height=8;
        box.calculate_area(box.height,box.width,box.length);
        box.calculate_area(box.height,box.width);
        box.display(box.height,box.width,box.length);
    }
}
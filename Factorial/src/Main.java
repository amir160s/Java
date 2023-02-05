public class Main {
    public static int fi(int n)
    {
        if(n==0) {
            return 1;
        }
        else
        {
            return n*fi(n-1);
        }
    }

    public static void main(String[] args) {
        // write your code here
        int a=5,result=0;
        result=fi(a);
        System.out.println(result);
    }
}
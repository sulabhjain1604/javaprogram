import java.util.Scanner;
public class Math {
    public static void main(String...s) {
        int a,b,c;
        Scanner scanner =new Scanner(System.in);
        a=scanner.nextInt();
        b= scanner.nextInt();
        c=Math.add(a,b);
        System.out.println(c);
    }
    private static int add(int x,int y){
    int z=x+y;
    return z;

    }
}

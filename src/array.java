import java.util.Scanner;
class array
{
    public static void main(String...s)
    {
        int x[] ,y[];
        x=new int[7];
        y=new int[7];
         System.out.println("Enter a element of x array");
        Scanner sc=new Scanner(System.in);

        for ( int i=0;i<7;i++)

            x[i]=sc.nextInt();

        System.out.println("Enter a element of y array");
        for ( int j=0;j<7;j++)

            y[j]=sc.nextInt();

        }
}



import java.util.Scanner;
class niven
{
    public static void main(String...s)
    {
        int n,a,sum=0,r=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check niven or not");
        n= sc.nextInt();
        a=n;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r;
        }
        if (a%sum==0)
        {
          System.out.println(a+" is a niven number");
        }
        else
        {
            System.out.println(a  +" is not a niven number");
        }
    }
}

import java.util.Scanner;
 import java.lang.Math;
class disarium
{
    public static void main(String...s)
    {
        String str;

        char c;
        int n,sum=0,len,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value to check whether disarium or not ");
        str=sc.next();
        len=str.length();
        n=Integer.parseInt(str);
        for(int i=1;i<=len;i++)
        {
         c=str.charAt(i-1);
      //  f=Integer.parseInt(c);
            f=Character.getNumericValue(c);
        sum =   sum+(int )(Math.pow(f,i));
        }

        if (sum==n)

        System.out.println(n+" is a disarium");
        else
            System.out.println(n+" is not  a disarium");
    }
}


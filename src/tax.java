import java.util.Scanner ;
class tax{
    public static void main(String...s){
      float  Taxable_amt=0;
                float Tax=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Salary");
        float sal=sc.nextFloat();

        Taxable_amt=sal-5000;
        Tax=0;

        if (Taxable_amt>=10000)
            Tax=Tax+1000;
        else
            Tax= (float) (Tax+(Taxable_amt *0.1));
        Taxable_amt=Taxable_amt-10000;


        if (Taxable_amt>=15000)
            Tax=Tax+3000;
        else if (Taxable_amt>0)
            Tax = (float) (Tax+(Taxable_amt *0.2));
        Taxable_amt=Taxable_amt-15000;
        if (Taxable_amt >=0)
            Tax= (float) (Tax+(Taxable_amt *0.35));

        System.out.println("Tax for "+sal+" is "+Tax);
    }
}
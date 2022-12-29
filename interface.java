import java.util.*

interface divisions
{
  int division();


class IntegerDivision implements divisions
{
   int n,m,q;

   IntegerDivision(int n1,int n2)
   { 
     n=n1;
     m=n2;
   }

   int division()
   {
     q=n1/n2;
     return(q);
   }
}

class Main
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two integer numbers");
    
    try
    {
      int num1=sc.nextInt();
      int num2=sc.nextInt();
     
      IntegerDivision id = new IntegerDivision(num1,num2);
     
      System.out.println(id.division());
    }
    catch(NumberFormatException e1)
    {
      System.out.println("Since one or more numbers entered are not integers, hence "+e1);
    }
    catch(ArithmeticException e2)
    {
      System.out.println(e2);
    }
}

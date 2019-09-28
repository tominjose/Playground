import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in ));
      Integer n=Integer.parseInt(br.readLine());
      if(n<=100)
      {
        if(n<=59&&n>=50)
        {
          System.out.println("E");
        }
        else if(n<=69&&n>=60)
        {
          System.out.println("D");
        }
        else if(n<=79&&n>=70)
        {
          System.out.println("C");
        }
        else if(n<=89&&n>=80)
        {
          System.out.println("B");
        }
        else if(n<=99&&n>=90)
        {
          System.out.println("A");
        }
        else if(n==100)
        {
          System.out.println("S");
        }
        else
        {
          System.out.println("F");
        }
      }
      else
      {
        System.out.println("Invalid Input");
      }
    }
}
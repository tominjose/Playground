import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer n=Integer.parseInt(br.readLine());
      if(n>99&&n<1000)
      {
        n=(n/10)%10;
        if(n%3==0)
        {
         System.out.println("Trendy Number");
        }
        else
        {
          System.out.println("Not a Trendy Number");
        }
      }
      else
      {
        System.out.println("Not a Trendy Number");
      }
    }
}
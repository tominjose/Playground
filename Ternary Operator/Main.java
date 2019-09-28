import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Integer x=Integer.parseInt(br.readLine());
       if(x%2==0)
       {
         System.out.println("Even");
       }
       else
       {
         System.out.println("Odd");
       }
    }
}
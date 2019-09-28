import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer a=Integer.parseInt(br.readLine());
      Integer b=Integer.parseInt(br.readLine());
      Integer c=Integer.parseInt(br.readLine());
      if(a<b)
      {
        if(a<c)
        {
          System.out.println("L1");
        }
        else
        {
          System.out.println("L3");
        }
      }
      else
      {
        System.out.println("L2");
      }
      
    }
}
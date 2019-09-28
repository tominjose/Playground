import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer l1=Integer.parseInt(br.readLine());
      Integer l2=Integer.parseInt(br.readLine());
      Integer l3=Integer.parseInt(br.readLine());
      String l=br.readLine();
      if(l.equals("L1")==true)
      {
        if(l2<l3)
        {
          System.out.println("L2");
        }
        else
        {
          System.out.println("L3");
        }
      }
      else if(l.equals("L2")==true)
      {
        if(l1<l3)
        {
          System.out.println("L1");
        }
        else
        {
          System.out.println("L3");
        }
      }
      else if(l.equals("L3")==true)
      {
        if(l1<l2)
        {
          System.out.println("L1");
        }
        else
        {
          System.out.println("L2");
        }
      }
    }
}
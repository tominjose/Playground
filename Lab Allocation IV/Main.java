import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer x=Integer.parseInt(br.readLine());
      Integer y=Integer.parseInt(br.readLine());
      Integer z=Integer.parseInt(br.readLine());
      Integer n=Integer.parseInt(br.readLine());
       if(x<y)
      {
        if(x<z)
        {
          if(n<=x)
          {
          System.out.println("L1");
        }}
        else
        {
           if(n<=z)
           {
           System.out.println("L3");
        }
        else
        if(n<=x)
        {
          System.out.println("L1");
        }
        }
       
      }
      else if(y<z)
      {
         if(n<=y)
         {
         System.out.println("L2");
      }
        else if(n<=z)
        {
          System.out.println("L3");
         
        }
       
      }
      else if(z<x)
      { if(n<=z)
      {
         System.out.println("L3");
      }
       else if(n<=x)
       {
         System.out.println("L1");
       }
      }
    }
}
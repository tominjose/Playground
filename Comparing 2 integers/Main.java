import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Integer x=Integer.parseInt(br.readLine());
       Integer y=Integer.parseInt(br.readLine());  
       if(x>y)
       {
        System.out.println(x+" greater than "+y);
       }
       else if(x<y)
       {
         System.out.println(x+" less than "+y);
       }
      else
      {
        System.out.println(x+" and "+y+" are equal");
      }
    }
}
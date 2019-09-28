import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer a=Integer.parseInt(br.readLine());
      Integer b=Integer.parseInt(br.readLine());
      if(b==0)
      {
        a=100-a;
        System.out.println(a);
      }
      else if(b<100&&b>a)
      {
        a=b-a;
        System.out.println(a);        
      }
      else if(b<100&&b<a)
      {
        a=100-a+b;
        System.out.println(a);        
      }
      
    }
}
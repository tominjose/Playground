import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer a=Integer.parseInt(br.readLine());
      Integer b=Integer.parseInt(br.readLine());
      Integer c=Integer.parseInt(br.readLine()); 
      Integer d=Integer.parseInt(br.readLine()); 
      Integer n=0;
      if(a>d)
      {
        n++;
      }
      if(b>d)
      {
        n++;
      }
      if(c>d)
      {
        n++;
      }
      System.out.println(n);
    }
}
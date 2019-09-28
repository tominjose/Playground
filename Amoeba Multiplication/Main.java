import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer n=Integer.parseInt(br.readLine());
      int i,f=0,s=1,b=0;
      for(i=3;i<=n;i++)
      {
        b=f+s;
        f=s;
        s=b;
        if(i==n)
        {
          System.out.println(b);
        }
      }
      
    }
}
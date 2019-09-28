import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Integer x=Integer.parseInt(br.readLine());
        Integer n=Integer.parseInt(br.readLine());
        int i,f=1;
        if(n==0)
        {
          System.out.println(1);
        }
      else
      {
        
        for(i=0;i<n;i++)
        {
          f=f*x;
        }
        System.out.println(f);
      }
    }
}
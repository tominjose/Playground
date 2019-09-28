import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine());
      int a=0,b=0,c=1,t,i;
      System.out.printf("%d",a);
      System.out.printf(" %d",b);
      System.out.printf(" %d",c);
      for(i=0;i<n-3;i++)
      {
        t=a+b+c;
        System.out.printf(" %d",t);
        a=b;
        b=c;
        c=t;
        
      }
    }
}
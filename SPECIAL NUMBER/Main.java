import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer f=Integer.parseInt(br.readLine());
      Integer l=Integer.parseInt(br.readLine());
      int i=0,m=0,j=0,k=0,t=0,r,n=0;
      for(i=f;i<=l;i++)
      {
        r=i;
        n=r%10;
        m=r/10;
        j=n+m;
        k=n*m;
        t=j+k;
        if(i==t)
        {
         System.out.println(i); 
        }
      }
      
    }
}
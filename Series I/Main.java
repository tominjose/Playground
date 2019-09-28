import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer n=Integer.parseInt(br.readLine());
      int c=0,i,t=1;
      System.out.printf("%d",t);
      while(n!=0)
      {
        for(i=2;c<n-1;i++)
        {
          if(i%2==1)
          {
            c++;
            t=t+i;
            System.out.printf(" %d",t);
          }
        }
        n--;
      }
	}
}
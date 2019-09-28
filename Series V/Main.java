import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer n=Integer.parseInt(br.readLine());
      int a=11,i;
      System.out.printf("%d",a*a);
      for(i=1;i<n;i++)
      {
        a=a+4;
        System.out.printf(" %d",a*a);
      }
	}
}
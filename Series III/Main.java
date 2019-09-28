import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer n=Integer.parseInt(br.readLine());
      int a=3,i;
      System.out.printf("%d",a);
      n=n-1;
      while(n!=0)
      {
        a=a*3;
        System.out.printf(" %d",a);
        n--;
      }
	}
}
import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer n=Integer.parseInt(br.readLine());
      Float a=0.5f;
      System.out.printf("%.1f",a);
      Float b=1.0f,m=3.0f;
      n=n-1;
      while(n!=0)
      {
        a=a+b;
        System.out.printf(" %.1f",a);
        b=b*m;
        n--;
      }
	}
}
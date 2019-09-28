import java.io.*;
import java.lang.Math;
class Main
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Integer a=Integer.parseInt(br.readLine());
       Float t=Float.parseFloat(br.readLine());
      Float f=13.30f;
      if(a>13)
      {
        if(Float.compare(t,f) == 0)
        {
          System.out.println("$5.00");
        }
        else
        {
          System.out.println("$8.00");
        }
      }
      else
      {
        if(Float.compare(t,f) == 0)
        {
          System.out.println("$2.00");
        }
        else
        {
          System.out.println("$4.00");
        }
      }
	}
}
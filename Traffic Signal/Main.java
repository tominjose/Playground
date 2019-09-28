import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Float s=Float.parseFloat(br.readLine());
       Float d=Float.parseFloat(br.readLine());
       Float t=Float.parseFloat(br.readLine());
       Float r=((s/60)/60)*t;
      if(r>d)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}
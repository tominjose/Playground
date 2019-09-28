import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String a=br.readLine();
      Integer b=Integer.parseInt(br.readLine());
      if(a.equals("front")==true)
      {
        if(b==1)
        {
          System.out.println("Left Handed");
        }
        else
        {
          System.out.println("Right Handed");
        }
      }
      else
      {
        if(b==1)
        {
          System.out.println("Right Handed");
        }
        else
        {
          System.out.println("Left Handed");
        }
	}
    }
        
}
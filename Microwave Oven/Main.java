import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer n=Integer.parseInt(br.readLine());
      Float c=Float.parseFloat(br.readLine());
      Float k;
      if(n==2)
      {
        c=c+(c/2);
        System.out.println(c);
      }
      else if(n==3)
      {
        c=c*2;
        System.out.println(c);
      }
      else if(n>3)
      {
        System.out.println("Number of items is more");
      }
	}
}
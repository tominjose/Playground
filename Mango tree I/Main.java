import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Integer r=Integer.parseInt(br.readLine());
       Integer c=Integer.parseInt(br.readLine());
       Integer n=Integer.parseInt(br.readLine());
       if(n%c==0)
       {
         System.out.println("Yes");
       }
       else if(n%c==1)
       {
         System.out.println("Yes");
       }
       else if(n>1&&n<c)
       {
         System.out.println("Yes");
       }
       else
       {
         System.out.println("No");
       }
         
	}
}
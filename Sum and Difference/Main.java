import java.io.*;
class Main
{
    	public static void main(String args[]) throws IOException
        {
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           Integer a=Integer.parseInt(br.readLine());
           Integer b=Integer.parseInt(br.readLine());
          Integer c=a+b;
           Integer s=a-b;
          System.out.println(c);
          System.out.println(s);
          
          
        }
}
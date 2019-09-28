import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Integer n=Integer.parseInt(br.readLine());
        Integer r=n%10;
        Integer d=n/10;
        Integer s=r+d;
        System.out.println("Alice must go in path-"+s);
	}
}
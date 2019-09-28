import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Integer x=Integer.parseInt(br.readLine());
        Integer c=Integer.parseInt(br.readLine());
        Integer s=Integer.parseInt(br.readLine());
        c=x*c;
        s=x*s;
        Integer p=c-s-100;
        System.out.println("The profit obtained is Rs."+p);
	}
}
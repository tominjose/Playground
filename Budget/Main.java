import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Integer blr=Integer.parseInt(br.readLine());
       Integer vs=Integer.parseInt(br.readLine());
       Integer as=Integer.parseInt(br.readLine());
       Integer a=Integer.parseInt(br.readLine());
       Integer l=Integer.parseInt(br.readLine());
       Float p=blr*350.34f;
       Float q=vs*230.90f;
       Float r=as*190.55f;
       Float s=a*125.30f;
       Float t=l*180.90f;
       Float c=p+q+r+s+t;
       if(c>15000)
       {
         System.out.println("No");
       }
       else
       {
         System.out.println("Yes");
       }
	}
}
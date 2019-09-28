import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Integer s=Integer.parseInt(br.readLine());
       Integer l=Integer.parseInt(br.readLine());
       Integer b=Integer.parseInt(br.readLine());
       Float r=Float.parseFloat(br.readLine());
       s=s*s;
       System.out.println(s);
       Integer a=l*b;
       System.out.println(a);
       Double k=3.14*r*r;
      System.out.printf("%.3f",k);
    }
}
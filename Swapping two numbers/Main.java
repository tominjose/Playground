import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Integer a=Integer.parseInt(br.readLine());
        Integer b=Integer.parseInt(br.readLine());
        Integer c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}
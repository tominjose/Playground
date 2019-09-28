import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Integer a=Integer.parseInt(br.readLine());
        Integer b=Integer.parseInt(br.readLine());
        Integer m,d,r;
        m=a*b;
        d=a/b;
        r=a%b;
        System.out.println(m);
        System.out.println(d);
        System.out.println(r);
        
        
    }
}
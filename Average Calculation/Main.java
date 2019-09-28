import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Integer a=Integer.parseInt(br.readLine());
        Integer b=Integer.parseInt(br.readLine());
        Integer c=Integer.parseInt(br.readLine());
        Integer d=Integer.parseInt(br.readLine());
        Integer e=Integer.parseInt(br.readLine());
        Double avg=(a+b+c+d+e)/5.0;
        System.out.printf("%.2f",avg);
        
    }
}
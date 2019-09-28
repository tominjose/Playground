import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Integer p=Integer.parseInt(br.readLine());
       Integer t=Integer.parseInt(br.readLine());
       Float r=Float.parseFloat(br.readLine());
       Double si=(p*r*t)/100.0;
       System.out.println(si);
    }
}
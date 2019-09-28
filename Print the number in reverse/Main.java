import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer s=Integer.parseInt(br.readLine());
      Integer f=Integer.parseInt(br.readLine());
      while(s>=f)
      {
        System.out.println(s);
        s--;
      }
    }
}
import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer f=Integer.parseInt(br.readLine());
      Integer s=Integer.parseInt(br.readLine());
      while(f<=s)
      {
        System.out.println(f);
        f++;
      }
    }
}
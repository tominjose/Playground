import java.io.*;
class Main
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer l=Integer.parseInt(br.readLine());
    Integer b=Integer.parseInt(br.readLine());
    Integer p=(l+b)*2;
    Integer a=l*b;
    System.out.println(p+"m");
    System.out.println(a+"sqm");
  }
}
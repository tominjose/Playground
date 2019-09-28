import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer n=Integer.parseInt(br.readLine());
      Integer l=Integer.parseInt(br.readLine());
      int i;
      for(i=1;i<=l;i++)
      {
        Integer d=n*i;
        System.out.println(i+"*"+n+"="+d);
      }
    }
}
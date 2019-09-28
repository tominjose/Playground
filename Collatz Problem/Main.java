import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine());
      int i,c=0;
      System.out.println(n);
      while(n>1)
      {
       if(n%2==0)
       {
        n=n/2;
        System.out.println(n);
        c++;
       }
       else if(n%2==1)
       {
         n=(3*n)+1;
         System.out.println(n);
         c++;
       }
      }
      System.out.println(c);
    }
}
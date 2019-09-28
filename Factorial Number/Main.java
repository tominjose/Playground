import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine());
      int i,f=1,c=0;
      for(i=1;i<n;i++)
      {
        f=f*i;
        if(n==f)
        {
          c++;
          break;
        }
      }
      if(c==1)
      {
        System.out.println("Yes");
      }
      else if(c==0)
      {
        System.out.println("No");
      }
    }
}
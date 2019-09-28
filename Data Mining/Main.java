import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer n=Integer.parseInt(br.readLine());
      Integer e=0;
      Integer o=0,c=0,i;
      int no=n,na=n;
      while(no!=0){
      no = no/10;
      c++;
      }
      for(i=0;i<c;i++)
      {
        na=n%10;
        if(na%2==0)
        {
          e=e+na;
        }
        else if(na%2==1)
        {
          o=o+na;
        }
      }
      if(e==n)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}
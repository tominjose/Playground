import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer n=Integer.parseInt(br.readLine());
      Integer o=0,e=0,i;
      for(i=0;i<n;i++)
      {
        Integer c=Integer.parseInt(br.readLine());
        if(c>=0)
        {
          e++;
        }
        else if(c<=0)
        {
          o++;
        }
      }
      System.out.println("Number of positive numbers is "+e+" and the number of negative numbers is "+o);
    }
}
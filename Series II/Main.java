import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Integer n=Integer.parseInt(br.readLine());
      Integer a=6,i,c=0;
      Integer j=0;
      System.out.printf("%d",a);
      while(n!=0)
      {
        for(i=1;c<n-1;i++)
        {
          if(i%2==0)
          {
            
            j=j+5;
            a=a+j;
            System.out.printf(" %d",a);
          }
          else if(i%2==1)
          {
            j=j+5;
            a=a+j;
            
            System.out.printf(" %d",a);
          }
          c++;
        }
        n--;
      }
	}
}
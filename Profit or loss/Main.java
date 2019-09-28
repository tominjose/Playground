import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in ));
      Float c=Float.parseFloat(br.readLine());
      Float s=Float.parseFloat(br.readLine()); 
      Float t=s*12;
      Float l;
      Float p;
      if(c>t)
      {
        l=c-t;
        System.out.printf("Loss : Rs.%.2f",l);
      }
      else if(t>c)
      {
        p=t-c;
        System.out.printf("Profit : Rs.%.2f",p);
      }
      else
      {
        System.out.println("No profit nor loss");
      }
    }
}
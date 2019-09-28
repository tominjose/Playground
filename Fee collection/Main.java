import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in)) ;
       String t=br.readLine();
       Float tf=Float.parseFloat(br.readLine());
       Float bf=Float.parseFloat(br.readLine());
       Float hf=Float.parseFloat(br.readLine());
       Float r;
       if(t.equals("MSDS"))
       {
         r=tf+bf;
         System.out.printf("%.2f",r);
       }
      else if(t.equals("MSH"))
       {
         r=tf+hf;
         System.out.printf("%.2f",r);
       }
       else if(t.equals("MGSDS"))
       {
         Float a=tf/2;
         r=a+tf+bf;
         System.out.printf("%.2f",r);
       }
      else if(t.equals("MGSH"))
       {
         Float b=tf/2;
         r=b+tf+hf;
         System.out.printf("%.2f",r);
       }
    }
}
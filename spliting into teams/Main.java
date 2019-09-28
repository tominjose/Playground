import java.io.*;
class Main
{
public static void main(String args[]) throws IOException
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  Integer s=Integer.parseInt(br.readLine());
  Integer t=Integer.parseInt(br.readLine());
  Integer n=s/t;
  Integer r=s%t;
  System.out.println("The number of students in each team is "+n+" and left out is "+r);
}
}
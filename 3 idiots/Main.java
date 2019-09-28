import java.io.*;
class Main
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer x1=Integer.parseInt(br.readLine());
    Integer y1=Integer.parseInt(br.readLine());
    Integer x2=Integer.parseInt(br.readLine());
    Integer y2=Integer.parseInt(br.readLine());
    Double mx=(x1+x2)/2.0;
    Double my=(y1+y2)/2.0;
    System.out.println("Binoy's house is located at ("+mx+","+my+")");
  }
}
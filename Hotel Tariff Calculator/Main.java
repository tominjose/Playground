import java.io.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Integer m=Integer.parseInt(br.readLine());
       Float r=Float.parseFloat(br.readLine());
       Integer d=Integer.parseInt(br.readLine());
       Float c;
       switch(m)
       {
         case 1:
         case 2:
         case 3:
         case 5:
         case 7:
         case 8:
         case 9:
         case 10:
            c=r*d;
            System.out.printf("%.2f",c);
            break;
         case 4:
         case 6:
         case 11:
         case 12:
            Float k=(r/10)*2;
            r=r+k;
            c=r*d;
            System.out.printf("%.2f",c);
            break;
         default:
           System.out.println("Invalid Input");
       }
         
	}
}
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner br=new Scanner(System.in);
       char c=br.next().charAt(0);
       switch(c)
       {
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
             System.out.println("Vowel");
             break;
         case 'b':
         case 'c':
         case 'd':
         case 'f':
         case 'g':
         case 'h':
         case 'l':
         case 'm':
         case 'n':
         case 'p':
         case 'q':
         case 'r':
         case 's':
         case 't':
         case 'v':
         case 'w':
         case 'x':
         case 'y':
         case 'z':
              System.out.println("Consonant");
               break;
         default:
              System.out.println("Not an alphabet");
    }
}
}
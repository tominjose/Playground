#include<stdio.h>
#include<string.h>
int main()
{
   char a[100];
   
   scanf("%[^\n]s", a);
   int k;
   
   scanf("%d", &k);
   k=k%26;
   int L = strlen(a);
   
   for(int i = 0; i <= L - 1; i++)
   {
     char ch = a[i];
     if(ch >= 'A' && ch <= 'Z')
     {
       int offset = ch - 'A';
       offset = (offset - k) % 26;
       ch = offset + 'A';
     }
     else if(ch >= 'a' && ch <= 'z')
     {
       int offset = ch - 'a';
       offset = (offset - k) % 26;
       ch = offset + 'a';
       if(ch>90&&ch<=96)
         ch=ch+26;
     }
     a[i] = ch;
   }
   printf("%s", a);
}
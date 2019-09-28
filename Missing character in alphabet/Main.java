// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include <string.h>
int main()
{
  char str[100],temp[100];
  int n,i,k,j;
  scanf("%[^\n]s",str);
  n=strlen(str);
  for(i=0; i<26; i++)
   {
     temp[i] = 'a'+i;
   }
   temp[i]='\0'; 
   for (int i = 0; i < 26; ++i) 
    {
     for (int j = 0; j < n; ++j) 
       {
        if(temp[i]==str[j])
         {
           temp[i]='0';
         }      
       }           
     }
     for (int i = 0; i < 26; ++i)
      {
        if(temp[i]!='0')
        printf("%c ",temp[i]); 
      }
   return 0;
}

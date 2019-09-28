#include<stdio.h>
#include<string.h>
void main()
{  
  int i,j;
  char st1[20],st2[20];
  scanf("%s",st1);
  scanf("%s",st2);
  char temp[20];
  int l1 = strlen(st1);
  int r=1,c=0;
  while(r!=l1)
  {
   for( i = 0; i < l1; i++)
   {
     j = (i + r) % l1;
     temp[j] = st1[i];
   }
   if(strcmp(temp,st2)==0)
   {
      c=1;
      break;
   }
   r++;
 }
 if(c==1)
 {
  printf("Yes");
 }
 else
 {
   printf("No");
 }
}
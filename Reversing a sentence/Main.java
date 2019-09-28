#include<stdio.h>
#include<string.h>
void main()
{
  char str[100],temp[100];
  int i, l,j=0,k,c;
  scanf("%[^\n]s",str);
  l=strlen(str);
  for(i=0; str[i]!='\0'; i++)
  {
   if(str[i]==' ')
    {
      temp[j++]=i;
    }
  }
  for(i=j-1;i>=0 ; i--)
  {
    c=0;
    for( k=temp[i]+1;k<l;k++)
    {
      printf("%c",str[k]);
      c++;
    }
    printf(" ") ;
    l=l-c-1;
  }
  for(i=0;i<l;i++)
  {
    printf("%c",str[i]);
  }
}

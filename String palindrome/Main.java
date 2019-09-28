#include<stdio.h>
int main()
{
  int i,l,flag=0;
  char str[1000];
  scanf("%s",&str);
  l=strlen(str);
  for(i=0;i<l;i++)
  {
    if(str[i]!=str[l-i-1])
    {
      flag=1;
    }
  }
  if(flag==0)
  {
    printf("%s is a palindrome",str);
  }
  else
  {
    printf("%s is not a palindrome",str);
  }
  return 0;
}

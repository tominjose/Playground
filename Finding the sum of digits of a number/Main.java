#include <stdio.h>
int main() 
{
  int n,c=0,s=0,a=0;
  scanf("%d",&n);
  while(n>0)
  {
     a=n%10;
     s=s+a;
     n=n/10;
  }
    printf("%d",s);
	return 0;
}
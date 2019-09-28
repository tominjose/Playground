#include<stdio.h>
int sum(int n);
void main()
{
	int n;
	scanf("%d",&n);
	sum(n);
    printf("%d",sum(n));
}

int sum(int n)
{
 if(n>1)
  {
    return n+sum(n-1);
  }
  else
  {
   return 1;
  }
}
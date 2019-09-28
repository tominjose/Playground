#include <stdio.h>
int main()
{
  int i,n,j=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    printf("%d \n",j);
    j=j+2;
  }
  return 0;
}
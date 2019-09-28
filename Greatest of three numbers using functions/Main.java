#include <stdio.h>
int main()
{
    int n1,n2,n3;
    scanf("%d %d %d",&n1,&n2,&n3);
    got(n1,n2,n3);
}
int got(int n1,int n2,int n3)
{
  int a;
    if(n1>n2)
    {
      a=n1;
    }
    else 
    {
      a=n2;
    }
  if(a>n3)
  {
    printf("%d",a);
  }
  else
  {
    printf("%d",n3);
  }
}
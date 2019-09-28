#include <stdio.h>
int main()
{
    int n1,n2,n3;
    scanf("%d %d %d",&n1,&n2,&n3);
    gcd(n1,n2,n3);
}
int gcd(int n1,int n2,int n3)
{
  int a,m,gcd;
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
      m=a;
    }
    else
    {
      m=n3;
    }
    while(m>=1)
    {
     if((n1%m==0)&&(n2%m==0)&&(n3%m==0))
      {
        gcd=m;
        break;
      }
      m--;
    }
   printf("%d",m);
}
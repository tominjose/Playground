#include<stdio.h>
int main()
{
  int n,i;
  scanf("%d \n", &n);
  int a[n];
  for(int i=0;i<=n-1;i++)
  {
    scanf("%d",&a[i]);
  }
  int l=a[0];
  for(i=0;i<n;i++)
  {
    if(l<a[i])
    {
      l=i;
    }
  }
  printf("%d",l);
  return 0;
}
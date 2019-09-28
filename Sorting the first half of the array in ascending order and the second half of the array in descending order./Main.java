#include<stdio.h>
int main()
{
  int n,i,j,t;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
 // e=n-1;
  int m=n/2;
  for(i=0;i<m;i++)
  {
    for(j=i+1;j<m;j++)
    {
     if(a[i]>a[j])
      {
       t=a[j];
       a[j]=a[i];
       a[i]=t;
      }
    }
  }
   for(i=m;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
     if(a[i]<a[j])
      {
       t=a[j];
       a[j]=a[i];
       a[i]=t;
      }
    }
  }
  for(i=0;i<n;i++)
  {
    printf("%d ",a[i]);
  }
  return 0;
}
#include<stdio.h>
int main()
{
	int n,i,j;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n-1;i++)
  {
    for(j=i+1;j<n;j++)
    {
     if((a[i]<a[j])&&(a[i+1]<a[j]+1))
     {
       printf("%d,%d\n",a[i],a[j]);
     }
    }
  }
	return 0;
}
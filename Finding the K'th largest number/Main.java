#include<stdio.h>
int main()
{
  int n,i,j,k=0,arr[n],a=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&k);
  for(i=0;i<n;++i)
   {
     for(j=i+1;j<n;++j)
      {
        if(arr[i]>arr[j])
          {
            a=arr[i];
            arr[i]=arr[j];
            arr[j]=a;
           }
        }
     }
  printf("%d",arr[n-k]);
  return 0;
}
#include<stdio.h>
void main()
{
  int n,i,j,k=0,c=0;
  scanf("%d",&n);
  int arr[n];
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  } 
  for(i=1;i<=k;i++)
  {
    c=0;
    for(j=0;j<n;j++)
    {
      if(i==arr[j])
      {
       c=c+1;
      }      
    }
    printf("%d %d \n",i,c);
  }
  return 0;
}
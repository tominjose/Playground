#include<stdio.h>
int main()
{
  int n,i=0,j=0,a;
  scanf("%d",&n);
  int arr[n],c[n];
  for(i=0;i<n;i++)
  {
    scanf("%d \n",&arr[i]);
  }
  for (i = 0; i < n; i++) 
   {
    for (j = i + 1; j < n; j++)
     {
       if (arr[i] > arr[j]) 
         {
           a =arr[j];
           arr[j] = arr[i];
           arr[i] = a;
         }
     }
  }
   int t=1;
  for(int i=0;i<n;i++)
  {
    if(arr[i]==t)
    {
      t++;
    }
 
  }
  printf("%d",t);
  return 0;
}
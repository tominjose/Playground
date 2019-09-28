#include<stdio.h>
int main()
{
  int n,c=0,i=0,j=0,t=0,f=0;
  scanf("%d", &n);
  int arr[n];
  for(int i = 0; i <n; i++)
  {
    scanf("%d", &arr[i]);
  }
  for(i=0;i<n;i++)
  {
    c=0;
    for(j=0;j<n;j++)
    {
      if(arr[i]==arr[j])
      {
       c=c+1;
      }      
    } 
    if(c > t) 
       {
           f = arr[i];
           t = c;
       }
   }
  printf("%d",f);
  return 0;
}
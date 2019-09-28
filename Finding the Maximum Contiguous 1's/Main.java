#include<stdio.h>
int main()
{
   int n,c=0,i,j;
   scanf("%d", &n);
   int arr[n];
   for(int i = 0; i <n; i++)
   {
       scanf("%d", &arr[i]);
   }
   for(i=0;i<n-1;i++)
   {
       if(arr[i]==arr[j])
       {
         c=c+1;
       }    
    }
   printf("%d",c);
  return 0;
}
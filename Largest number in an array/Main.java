

#include<stdio.h>
int main()
 {
  int arr_size;
  scanf("%d \n", &arr_size);
  int arr[arr_size];
  for(int i=0;i<=arr_size-1;i++)
   {
    scanf("%d",&arr[i]);
   }
  int flag=0,a=0,index=0;
  int l=arr[0];
  for(int i=1;i<=arr_size-1;i++)
   {
     if(l<arr[i])
       {
        l=arr[i];
       }
   }
   printf("%d",l);
   return 0;
 }
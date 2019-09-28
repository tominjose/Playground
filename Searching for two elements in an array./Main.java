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
  int search_elem_1,search_elem_2,flag=0,a=0,index=0;
  scanf("%d", &search_elem_1);
  int search_elem2;
  scanf("%d", &search_elem_2);  
  for(int i=0;i<=arr_size-1;i++)
   {
     if(search_elem_1 == arr[i])
       {
         a=1;
         index=i;
         break;
       }
   }
   if(a==1)
    {
      printf("%d \n",index);
    }
   else
    {
      printf("-1 \n");
    }
   for(int i=0;i<=arr_size-1;i++)
   {
     if(search_elem_2==arr[i])
       {
         flag=1;
         index=i; 
         break;
       }
   }
    if(flag==1)
    {
      printf("%d \n",index);
    }
   else
    {
      printf("-1");
    }
   return 0;
 }


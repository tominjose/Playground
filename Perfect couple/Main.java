#include<stdio.h>
void check_sum_and_display(int arr[], int size, int sum);
int main()
{
    int size;
    scanf("%d", &size);
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    int sum;
    scanf("%d", &sum);
    check_sum_and_display(arr, size, sum);
    return 0;
}

void check_sum_and_display(int arr[], int size, int sum)
{
   int flag=0,i,j,p=0,q=0;
   for(int i = 0; i <= (size - 1); i++)
    {
      for(int j = i + 1; j <= (size - 1); j++)
       {
          if(sum== (arr[i]+arr[j]))
            {
              flag=1;
              p=arr[i];
              q=arr[j];
            }
       }
     }
   if(flag==1)
   {
     printf("Perfect couple: %d %d ",p,q);
   }
   else
   {
     printf("No perfect couple found!");
   }
}
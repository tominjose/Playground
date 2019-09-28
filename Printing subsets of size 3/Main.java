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
    subsets(arr, size);
    return 0;
}

void subsets(int arr[], int size)
{
   int i,j;
   for(int i = 0; i < (size - 1); i++)
    {
      for(int j = i + 1; j <= (size - 1); j++)
       {
        for(int k=j+1;k<=(size-1);k++)
        {
          printf("(%d, %d, %d) ",arr[i],arr[j],arr[k]);
        }
      }
     printf("\n");
   }
}
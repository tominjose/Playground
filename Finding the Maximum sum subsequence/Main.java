#include<stdio.h>
int main()
{
   int n;
   scanf("%d", &n);
   int arr[n];
   for(int i = 0; i <n; i++)
   {
       scanf("%d", &arr[i]);
   }
   int seq[2 * n];
   int seq_idx = 0;
   int start_idx = 0;
   for(int i = 0 ; i< n-1; i++)
   {
       if(arr[i] > arr[i + 1])
       {
           seq[seq_idx] = start_idx;
           seq_idx++;
           seq[seq_idx] = i;
           seq_idx++;
           start_idx = i + 1;
       }
   }  
   if(start_idx != n-1)
   {
           seq[seq_idx] = start_idx;
           seq_idx++;
           seq[seq_idx] = n - 1;
           seq_idx++;
   }     
   if(start_idx == n- 1)
   {
           seq[seq_idx] = start_idx;
           seq_idx++;
           seq[seq_idx] = n - 1;
           seq_idx++;
   }
  int lsum=0,sum=0;    
   for(int i = 0; i <= (seq_idx-1); i = i + 2)
   {
       start_idx = seq[i];
       int end_idx = seq[i + 1];
       for (int idx = start_idx ; idx <= end_idx; idx++)
       {
           sum=sum+arr[idx];
       }
       if(lsum<sum)
       {
         lsum=sum;
         sum=0;
       }
      }
 printf("%d ", lsum);
  return 0;
}

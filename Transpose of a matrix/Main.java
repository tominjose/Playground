#include <stdio.h>
int main()
{
  int m[10][10], t[10][10], r, c, i, j;
  scanf("%d %d", &r, &c);
  for(i=0; i<r; ++i)
  {
   for(j=0; j<c; ++j)
   {
     scanf("%d", &m[i][j]);
   }
  } 
  for(i=0; i<r; ++i)
  {
   for(j=0; j<c; ++j)
   {
    t[j][i] = m[i][j];
   }
  }
  for(i=0; i<c; ++i)
  {
   for(j=0; j<r; ++j)
   {
     printf("%d ",t[i][j]);
     if(j==r-1)
     {
       printf("\n");
     }
    }
  }
  return 0;
}
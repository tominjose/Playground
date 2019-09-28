#include<stdio.h>
int main()
{
  int r,c,i,j,k;
  scanf("%d\n",&r);
  scanf("%d",&c);
  int m[r][c];
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
    {
     scanf("%d",&m[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
   for(j=0,k=i;k<r;j++,k++)
    {
       printf("%d ",m[j][k]);
    }
  }
  return 0;
}
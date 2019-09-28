#include<stdio.h>
int main()
{
  int r,c,i,j,k,flag=1;
  scanf("%d\n",&r);
  scanf("%d",&c);
  int m[r][c],t[r][c];
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
    {
     scanf("%d",&m[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
    {
     scanf("%d",&t[i][j]);
    }
  }
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
    {
      if(m[i][j]!=t[i][j])
      {
        flag=0;
      }
    }
  }
  if(flag==1)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
  return 0;
}
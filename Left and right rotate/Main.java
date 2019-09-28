#include<stdio.h>
void rotate(int l[],int n,int iter);
int main()
{
   int n,l[10],i,r;
   scanf("%d",&n);
   for(i=0;i<n;i++)
   {
     scanf("%d",&l[i]);
   }
   scanf("%d",&r);
   rotate(l,n,r);
   return 0;  
}
 void rotate(int l[],int n,int r)
 {
     int i,j;
     int ot,et,ot_idx,et_idx;
     ot_idx=(n%2==0)?n-2:n-1;
     et_idx=(n%2==0)?n-1:n-2 ;
    for( i = 0;i<r;i++)
    {
        ot = l[ot_idx];
        for(j=ot_idx;j>=0;j=j-2)
        {    
            l[j]=l[j-2];
        } 
        l[0]=ot;
        et=l[1];
        for(j=1;j<n;j=j+2)
        {   
            l[j]=l[j+2]; 
        }  
        l[et_idx]=et;    
    }  
    for(i=0;i<n;i++ )
    {
        printf( "%d ", l[i]);
    }  
 }
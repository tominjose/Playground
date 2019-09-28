#include<stdio.h>
void main() 
{
    int b,e;
    scanf("%d",&b);
    scanf("%d",&e);
    power(b,e);
}
void power(int b,int e)
{
    int power=1;
    while(e>0)
    {
        power=power*b;
        e--;
    }
    printf("%d",power);
}
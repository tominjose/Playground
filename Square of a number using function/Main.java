#include<stdio.h>

int func(int);

int main()
{
int no, square;
scanf("%d",&no);
square = func(no);

printf(" %d ", square);

}

int func(int temp)
{
return temp*temp;
}
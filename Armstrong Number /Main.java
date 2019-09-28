#include<stdio.h>
int main()
{
   int n,c,s=0,rem;
   scanf("%d",&n);
   c = n; 
   while (n != 0)
   {
      rem = n % 10;
      s = s + (rem*rem*rem);
      n = n / 10;
   }
   if(c == s)
      printf("Armstrong Number",c);
   else
      printf("Not an Armstrong Number",c);
   return(0);
}
int main()
{
  int n,i;
  scanf("%d \n", &n);
  int arr[n];
  for(int i=0;i<=n-1;i++)
  {
    scanf("%d",&arr[i]);
  }
  int q=n/2,s=0,a=0,flag=0;
  for(i=0;i<q;i++)
  {
    s=s+arr[i];
  }
  for(i=q;i<n;i++)
  {
    a=a+arr[i];
  }
  if(s==a)
  {
    flag=1;
  }
  if(flag==1)
  {
    printf("Perfect Batch");
  }
  else
  {
    printf("Not a Perfect Batch");
  }
  return 0;
}
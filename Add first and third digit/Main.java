#include<stdio.h>
int main()
{
  int n,a;
  scanf("%d %d", &n);
  a=(n/100)+n%10;
  printf("%d",a);
  return 0;
}
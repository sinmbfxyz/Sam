#include <stdio.h>
void main ()
{
int n,p,i,temp;
printf("Enter the base: ");
scanf("%d",&n);
temp=n;
printf("Enter the power: ");
scanf("%d",&p);
for(i=1;i<=p-1;i++)
{
	n*=temp;
}
printf("power=%d",n);
}
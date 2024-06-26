#include <stdio.h>
void main()
{
	int a[5],b[5],i;
printf("Enter 5 numbers: ");
for(i=0;i<5;i++)
{
scanf("%d",&a[i]);
b[i]=a[i];
}

printf("The copied elements:\n");
for(i=0;i<5;i++)
{
printf("%d\n",b[i]);
}
}
#include<stdio.h>
void main()
{
	int a[5],i;
	printf("Enter 5 values:");
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("The negative element in the array:\n");
	for(i=0;i<5;i++)
	{
		if(a[i]<0)
		{
			printf("%d\n",a[i]);
		}
	}
}
#include<stdio.h>
void main()
{
	int sum=0;a[5],i;
	printf("Enter 5 elements:");
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
		sum+=a[i];
	}
	printf("The sum of the elements is %d",sum);
}
#include<stdio.h>
void main()
{
	int a;
	printf("Enter the age:");
	scanf("%d",&a);
	if(a>=18)
	{
		printf("You are eligible to vote");
	}
	else
	{
		printf("You are not eligible to vote");
	}
}
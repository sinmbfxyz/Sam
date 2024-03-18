#include <stdio.h>
void main()
{
	int a[5],i,n,yes=0;
	printf("Enter 5 numbers: ");
	for(i=0;i<5;i++)
	{
	scanf("%d",&a[i]);
	}
	printf("Enter a number you want search: ");
	scanf("%d",&n);
	for(i=0;i<5;i++)
	{
		if(a[i]==n)
		{
			yes=1;
	
		}
	}
	if(yes)
	{
		printf("Number found");
	}
	else
	{
		printf("Not found");
	}
	
}
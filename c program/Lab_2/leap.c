#include <stdio.h>
#include <stdlib.h>
void main()
{
	system("color 4f");
	int year;
	printf("Enter the year: ");
	scanf("%d",&year);
	if(year%4==0)
	{
		if(year%100==0)
		{
			if(year%400==0)
			{
				printf("It is a leap year");
			}
			else
			{
				printf("Not a leap year");
			}
		}
		else
		{
			printf("It is a leap year");
		}
	}
	else {
		printf("Not a leap year");
	}
}
#include <stdio.h>
void main()
{
	int amount;
	printf("Enter the amount: ");
	scanf("%d",&amount);
	printf("The amount with 5%% tax is %g",(( (float)5/100)*amount)+amount);
}
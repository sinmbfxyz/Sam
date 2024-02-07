#include <stdio.h>
void main()
{
	int num;
	printf("Enter a number: ");
	scanf("%d",&num);
	(num>0)? printf("number is positive"):(num==0)?printf("Number is zero"): printf("Number is negative");
}
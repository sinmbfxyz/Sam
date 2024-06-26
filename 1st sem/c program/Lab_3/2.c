#include <stdio.h>
void main()
{
	char c;
	printf("Enter a character: ");
	scanf("%c",&c);
	if(c>=97)
	{
		printf("This is a lowercase letter");
	}
	else
	{
		printf("This is a uppercase letter");
	}
}
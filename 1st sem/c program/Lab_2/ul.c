#include <stdio.h>
#include <stdlib.h>
void main()
{
	char a;
	printf("Enter the character in lowercase: ");
	scanf("%c",&a);
	while (a<=97)
	{
		fflush(stdin);
	printf("\nEnter the character in lowercase: ");
	scanf("%c",&a);
	}
	printf("In uppercase: %c",a-=32);
}
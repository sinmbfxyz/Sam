#include <stdio.h>
void main()
{
	char c;
	printf("Enter a Uppercase alphabet: ");
	scanf("%c",&c);
	printf("The alphabet in Lowercase: %c",c+32);
}
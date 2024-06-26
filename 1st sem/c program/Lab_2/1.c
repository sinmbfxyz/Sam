#include <stdio.h>
void main()
{
	char c;
	printf("Enter a lowercase alphabet: ");
	scanf("%c",&c);
	printf("The alphabet in uppercase: %c",c-32);
}
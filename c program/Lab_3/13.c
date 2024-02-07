#include <stdio.h>
void main()
{
	char c;
	printf("Enter a character: ");
	scanf("%c",&c);
if(c>='A' && c<='Z' || c>='a' && c<='z')
{
	printf("This is an alphabet");
}
else if(c>='0' && c<='9')
{
	printf("This is a digit");
}
else
{
	printf("This is a special character");
}
}
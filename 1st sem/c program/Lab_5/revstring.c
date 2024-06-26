#include <stdio.h>
void main()
{
	char a[50],b[50];
	int i,len=0,count=0;
	printf("Enter a string: ");
	gets(a);
	for(i=0;a[i]!='\0';i++)
	{
		len++;
		b[i]=a[i];
	}
	for(i=len-1;i>=0;i--)
	{
		a[count]=b[i];
		count++;
	}
	printf("%s",a);
}

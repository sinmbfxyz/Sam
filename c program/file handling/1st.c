#include <stdio.h>
#include <stdlib.h>
void main()
{
	FILE *fp;
	char ch;
fp=fopen("abc.txt","w");
if(fp==NULL)
{
	printf("NO file found");
	exit(0);
	}
fputc('J',fp);
fclose(fp);
}
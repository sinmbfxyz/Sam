#include <stdio.h>
void main()
{
	int i,prev=0,temp=1,next,n;
	printf("enter a number");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		printf("\n%d",prev);
		next=prev+temp;
		temp=prev;
		prev=next;
	}
}
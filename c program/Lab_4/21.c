#include <stdio.h>
void main()
{
	int n,count=1,fact=1;
	printf("Enter a number: ");
	scanf("%d",&n);
	label:
		fact*=count;
		count++;
		printf("saM");
//	if(count<=n)
//	{
//		goto label;
//	};
	printf("The factorial of %d is %d",n,fact);		
}
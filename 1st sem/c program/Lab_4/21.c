#include <stdio.h>
void main()
{
	int n,i=1,fact=1;
	printf("Enter a number: ");
	scanf("%d",&n);
	label:
		fact*=i;
		i++; 
	if(i<=n)
	{
		goto label;
	};
	printf("The factorial of %d is %d",n,fact);		
}
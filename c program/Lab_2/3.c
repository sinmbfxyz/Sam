#include <stdio.h>
void main()
{
	int n,rem,rev=0;
	printf("Enter a number: ");
	scanf("%d",&n);
	rem=n%10;
	rev=rev*10+rem;
	n/=10;
	rem=n%10;
	rev=rev*10+rem;
	n/=10;
	rem=n%10;
	rev=rev*10+rem;
	printf("The reverse of the number is %d", rev);
}
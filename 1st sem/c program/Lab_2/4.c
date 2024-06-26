#include <stdio.h>
void main()
{
	int n,rem,sum=0;
	printf("Enter a number: ");
	scanf("%d",&n);
	rem=n%10;
	sum+=rem*rem;
	n/=10;
	rem=n%10;
	sum+=rem*rem;
	n/=10;
	rem=n%10;
	sum+=rem*rem;
	n/=10;
	rem=n%10;
	sum+=rem*rem;
	printf("The sum of square of the number is %d", sum);
}
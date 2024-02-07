#include <stdio.h>
void  main(){
	int a,b;
	printf("Enter 1st number: ");
	scanf("%d",&a);
	printf("Enter 2nd number: ");
	scanf("%d",&b);
	printf("Sum of %d and %d is %d\n",a,b,a+b);
	printf("Product of %d and %d is %d\n",a,b,a*b);
	printf("Division of %d and %d is %.2f\n",a,b,(float)a/b);
	printf("Subtraction of %d and %d is %d\n",a,b,a-b);
}
#include <stdio.h>

int func(){
	return 0;
}

void main()
{
	int a;
	float b;
	double c;
	char d;
	int value;
	printf("The size of int %d\n",sizeof(a));
	printf("The size of float %d\n",sizeof(b));
	printf("The size of double %d\n",sizeof(c));
	printf("The size of char %d\n",sizeof(d));
	printf(" the value %d",func());
}

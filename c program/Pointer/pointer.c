#include <stdio.h>
void main() {
	int *p1,**p2,a;
	a=30;
	p1=&a;
	p2=&p1;
	printf("%d\n",p1);
	printf("%d",**p2);

}
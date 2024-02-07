#include <stdio.h>
void main(){
	int r;
	float area,peri;
	printf("Enter the radius: ");
	scanf("%d",&r);
	area= 3.14*r*r;
	peri= 2*3.14*r;
	printf("Area= %.2f \n",area);
	printf("perimeter= %.2f",peri);
}
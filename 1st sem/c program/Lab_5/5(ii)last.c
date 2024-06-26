#include <stdio.h>
void main() {
	int a[100],b[100],c,d,merge[100],count=0,i;
	printf("Enter the size of a: ");
	scanf("%d",&c);
	printf("Enter the size of b: ");
	scanf("%d",&d);
	printf("Enter the elements in a");
	for(i=0; i<c; i++) {
		scanf("%d",&a[i]);
	}
	printf("Enter the elements in b");
	for(i=0; i<d; i++) {
		scanf("%d",&b[i]);
	}
	for(i=0; i<c+d; i++) {
		if(i<c) {
				merge[i]=a[i];
		
		} else {
			merge[i]=b[count];
			count++;
		}
	}
	for(i=0; i<c+d; i++) {
		printf("%d",merge[i]);
	}
}
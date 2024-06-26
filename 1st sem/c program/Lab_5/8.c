#include <stdio.h>
void main() {
	int a[5],i,slargest,largest,temp;
	printf("Enter 5 numbers: ");
	for(i=0; i<5; i++) {
		scanf("%d",&a[i]);
	}
	slargest=a[1];
	largest=a[0];
	for(i=0; i<5; i++) {
		if(a[i]>a[0]) {
			largest=a[i];
			temp=a[0];
			a[0]=a[i];
			a[i]=temp;
		}
	}
	for(i=2; i<5; i++) {
		if(a[i]>a[1]) {
			slargest=a[i];
		}
	}
	printf("%d\n",slargest);
}


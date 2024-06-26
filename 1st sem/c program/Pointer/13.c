#include <stdio.h>
void main() {
	char a[100], temp;
	int i;
	printf("Enter a string: ");
	gets(a);
	temp=a[0];
	puts(a);
	for(i=0; a[i]!='\0'; i++) {
		if(temp>='a' && temp<='z') {
			if(a[i]>='a' && a[i]<='z') {
				a[i]-=32;
			}
		} else {
			if(a[i]>='A' && a[i]<='Z') {
				a[i]+=32;
			}
		}
	}
	printf("%s",a);
}
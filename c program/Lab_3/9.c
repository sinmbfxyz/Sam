#include <stdio.h>
void main()
{
int unit,extra;
printf("Enter the unit consumed: ");
scanf("%d",&unit);
if(unit<=150)
{
	printf("The electricity bill = RS%d",unit*3);
}
else if(unit>=151 && unit <=350)
{
	extra=unit-150;
	printf("The electricity bill = RS%f",(150*3)+(extra*3.75)+100);
}
else if(unit>350 && unit<=450)
{
	extra=unit-350;
		printf("The electricity bill = RS%f",(150*3)+(200*3.75)+(extra*4)+250);
}
else
{
	extra=unit-450;
		printf("The electricity bill = RS%f",(150*3)+(200*3.75)+(100*4)+(extra*4.25)+300);	
}
}
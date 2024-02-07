#include <stdio.h>
void main()
{
float sal,tax;
printf("Enter the salary: ");
scanf("%f",&sal);
if(sal<=400000)
{
	tax=(float)(1/100) * sal;
	
}
else if(sal<=500000)
{
	tax=4000+(sal-400000)*(float)10/100;
}
else
{
	tax= 4000+10000+(float) 20/100 * (sal-500000);

}
	sal-=tax;
printf("Tax= %g",tax);
printf("\nSalary= %g",sal);

}
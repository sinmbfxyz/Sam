#include <stdio.h>
void main()
{
	float sal,bonus;
	char gender;
	printf("Enter the gender: ");
	scanf("%c",&gender);
	printf("Enter the salary: ");
	scanf("%f",&sal);
	if(gender=='m' && sal <10000)
	{
		bonus= ((float)5/100)*sal + ((float)2/100 * sal) ;
	}
	else if(gender=='f' && sal <10000)
	{
		bonus= ((float)10/100)*sal + ((float)2/100 * sal) ;
	}
	else if (gender=='m')
	{
			bonus= ((float)5/100)*sal ;
	}
	else 
	{
		bonus= ((float)10/100)*sal ;
	}
	printf("Bonus= %g \n",bonus);
		printf("The total salary is %g",bonus+sal);
}
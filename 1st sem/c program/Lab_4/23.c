#include <stdio.h>
void main ()
{
	int i,j;
	float sum=0,pro,temp;
	for(i=1;i<=7;i++)
	{
		pro=1;
		for(j=1;j<=i;j++)
		{
			pro*=j;
		
		}
		temp=(float)i/pro;
		printf("%.2f\n",temp);
		sum+=temp;
	}
	printf("%.2f",sum);
}
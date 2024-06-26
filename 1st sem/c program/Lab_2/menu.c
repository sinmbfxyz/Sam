#include <stdio.h>
#include <stdlib.h>
void main()
{
	int n,m;
	printf("*****Menu*****");
	printf("\n1.Momo");
	printf("\n2.Burger");
	printf("\n3.Noodles");
	printf("\n4.Pizza");
	printf("\n5.Exit");
	printf("\n****************");
	printf("\nEnter your choice: ");
	scanf("%d",&n);
	switch(n)
	{
		case 1:
			system("cls");
    printf("\nMomo items");
    	printf("\n*****Menu*****");
	printf("\n1.Chicken Momo");
	printf("\n2.Veg momo");
	printf("\n3.Buff momo");
	printf("\n4.exit");
		printf("\n*************");
	printf("\nEnter your choice of momo: ");
	scanf("%d",&m);
	switch(m)
	{
		case 1: 
		printf("\nRs 130");
		break;
			case 2: 
		printf("\nRs 100");
		break;
			case 3: 
		printf("\nRs 120");
	break;
		case 4: 
		exit(0);
	default: 
	printf("\nINVALID");
	}
	break;
	case 2:
		printf("\nBurger");
		break;
	
	case 3:
		printf("\nNoodles");
		break;
		
		case 4:
			printf("\nPizza");
			break;
			
			case 5:
				exit(0);
				
				default: 
				printf("\nInvalid");
	}
	
}
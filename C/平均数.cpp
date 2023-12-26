#include<stdio.h>

int main()
{
	double sum=0;
	int count=0;
	double number;
	
	scanf("%lf",&number);
	while(number!=-1){
			sum+=number;
			count++;
			scanf("%lf",&number);
		}
	printf("%f\n",sum/count);
	return 0;
}

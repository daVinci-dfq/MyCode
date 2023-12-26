#include<stdio.h>

int main()
{
	int N;
	scanf("%d",&N);
	
	double sum=0;
	double dividend,divisor;
	int i;
	double t;
	
	dividend=2;
	divisor=1;
	
    for(i=1;i<=N;i++){
    	sum+=dividend/divisor;
    	t=dividend;
    	dividend+=divisor;
    	divisor=t;
	}
	printf("%.2f\n",sum);
	
	return 0;
}

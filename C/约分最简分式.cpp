#include<stdio.h>

int main()
{
	int dividend,divisor;
	scanf("%d/%d",&dividend,&divisor);
	
	int t,a,b;
	a=dividend;
	b=divisor;
	while(b!=0){
		t=a%b;
		a=b;
		b=t;
	}
	
	dividend/=a;
	divisor/=a;
	
	printf("%d/%d\n",dividend,divisor);
	
	return 0;
}

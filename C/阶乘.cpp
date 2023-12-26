#include<stdio.h>

int main()
{
	int n;
	scanf("%d",&n);
	
	int fact=1;
	
	for(;n>0;n--){
		fact*=n;
	}
	
	printf("%d",fact);
	
	return 0;
}

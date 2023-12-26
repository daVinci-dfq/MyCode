#include<stdio.h>

int main()
{
	int x;
	scanf("%d",&x);
	
	int mask=1;
	int t=x;
	
	while(t>=10){
		t/=10;
		mask*=10;
	}
	
	for(;mask>0;mask/=10){
		int d=x/mask;
		printf("%d",d);
		if(mask>1){
			printf(" ");
		}
		x%=mask;
	}
	
	return 0;
}

#include<stdio.h>

int main()
{
	int a,b;
	scanf("%d %d",&a,&b);
	/*
	int t=a;
	
	for(;t>0;t--){
		if(a%t==0){
			if(b%t==0){
				printf("最大公约数是%d。",t);
				break;
			}
		}
}
	*/
	
	int t;
	
	while(b!=0){
		t=a%b;
		a=b;
		b=t;
	}
	printf("最大公约数是%d。",a);
	
	return 0;
}
	
	
	
	
	
	
	
	
	
	
	
	
	


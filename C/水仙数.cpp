#include<stdio.h>

int main()
{
	int N;
	scanf("%d",&N);
	
	int i=1;
	int x=1;
	for(;i<N;i++){
		x*=10;
	}
	
	i=x;
	for(;i<x*10;i++){
		int t=i;
		int sum=0;
		do{
			int d=t%10;
			t/=10;
			int k=1;
			int p=d;
			for(;k<N;k++){
				p*=d;
			}
			sum+=p;
		}while(t>0);
		if(sum==i){
			printf("%d\n",i);
		}	
	}
	
	return 0;
}

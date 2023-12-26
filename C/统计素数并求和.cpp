#include<stdio.h>

int main()
{
	int M,N;
	scanf("%d %d",&M,&N);
	
	if(M==1){
		M=2;
	}
	
	int nember=0;
	int sum=0;
	
	for(;M<=N;M++){
		int d=0;
		int t=2;
		for(;t<M;t++){
			if(M%t==0){
				d++;
			}
		}
		if(d==0){
			nember++;
			sum+=M;
		}
	}
	
	printf("%d %d",nember,sum);
	
	return 0;
}

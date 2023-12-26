#include<stdio.h>

int main()
{
	int N;
	scanf("%d",&N);
	
	int i=1;
	for(;i<=N;i++){
		int j=1;
		for(;j<=i;j++){
			printf("%d*%d=%d",j,i,i*j);
			if(i!=j&&i*j<10){
				printf("   ");
			}
			if(i!=j&&i*j>=10){
				printf("  ");
			}
		}
		printf("\n");
	}
	
	return 0;
}

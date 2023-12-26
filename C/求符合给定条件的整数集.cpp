#include<stdio.h>

int main()
{
	int a;
	scanf("%d",&a);
	
	int i,j,k;
	int cnt=0;
	
	i=a;
	
	for(;i<=a+3;i++){
		j=a;
		for(;j<=a+3;j++){
			k=a;
			for(;k<=a+3;k++){
				if(i!=j&&j!=k&&i!=k){
					printf("%d%d%d",i,j,k);
				    cnt++;
				    if(cnt%6==0){
				    	printf("\n");
					}else{
						printf(" ");
					}
			    }
			}
		}
	}
	
	return 0;
}

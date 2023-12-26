#include<stdio.h>
#include<math.h>

int isPrime(int x);
int main()
{
	int x;
	scanf("%d",&x);
	
		if(isPrime(x)){
			printf("是素数。\n");
		}else{
			printf("不是素数。\n");
		}
	
	return 0;
}


int isPrime(int x){
	int i;
	int ret=1;
	if(x==1||x%2==0&&x!=2){
		ret=0;
	}
	for(i=3;i<=sqrt(x);i=i+2){
		if(x%i==0){
			ret=0;
			break;
		}
	}
	return ret;
}

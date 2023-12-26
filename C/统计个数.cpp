#include<stdio.h>
int main() 
{
	const int number=10;
	int x;
	scanf("%d",&x);
	int count[number]={0,};
	int i;
	
	while(x!=-1&&x<10&&x>=0){
		count[x]++;
		scanf("%d",&x);
	}
	for(i=0;i<number;i++){
		printf("%d:%d\t",i,count[i]);
	}
	
	return 0;
}

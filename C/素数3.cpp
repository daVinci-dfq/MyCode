#include<stdio.h>

int isPrime(int x);
int main()
{
	const int n=100;
	int prime[n]={0};
	int x=2;
	int i;
	
	while(x<n){
		if(isPrime(x)){
			for(i=2;i*x<n;i++){
			prime[i*x]=1;
			}
		}
		x++;
	}
	
	for(i=2;i<n;i++){
		if(prime[i]==0){
			printf("%d\t",i);
		}
	}
	return 0;
}

int isPrime(int x){
	int i;
	int ret=1;
	for(i=2;i<x;i++){
		if(x%i==0){
			ret=0;
		}
	}
	return ret;
}

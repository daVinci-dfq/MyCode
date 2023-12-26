#include<stdio.h>

int main()
{
	FILE *fp = fopen("","r");
	if( fp ){
		int num;
		fscanf(fp,"%d",&num);
		fclose(fp);
	}else{
		printf("无法打开文件\n");
	}
	return 0;
}

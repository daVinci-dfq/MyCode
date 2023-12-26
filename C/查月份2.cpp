#include<stdio.h>
#include<string.h>

int main(){
	char *month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
	/*
	printf("请输入月份。\n");
	int number;
	scanf("%d",&number);
	printf("%s",*month[number]);
	*/
	
	char *curMonth=month[0];
	int mon=0;
	printf("请输入阿拉伯数字的月份数：");
	scanf("%d",&mon);
	switch(mon){
		case 1:
			curMonth=month[0];
			break;
		case 2:
			curMonth=month[1];
			break;
		case 3:
			curMonth=month[2];
			break;
		case 4:
			curMonth=month[3];
			break;
		case 5:
			curMonth=month[4];
			break;
		case 6:
			curMonth=month[5];
			break;
		case 7:
			curMonth=month[6];
			break;
		case 8:
			curMonth=month[7];
			break;
		case 9:
			curMonth=month[8];
			break;
		case 10:
			curMonth=month[9];
			break;
		case 11:
			curMonth=month[10];
			break;
		case 12:
			curMonth=month[11];
			break;
		default:
			curMonth="No this month";
	}
	if(strcmp(curMonth,"No this month")==0){
		printf("没有这个月份。\n");
	}else{
		printf("当前月份为：%s。\n",curMonth);
	}
	return 0;
}

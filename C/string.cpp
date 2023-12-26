#include<stdio.h>
#include<string.h>

int main(int argc,char const *argv[])
{
	int ch;
	
	while((ch=getchar())!=EOF){
		putchar(ch);
	}
	printf("EOF\n");
	return 0;
}

int mylen(const char*s)
{
	int idx=0;
	while(s[idx]){
		idx++;
	}
	return idx;
}

int mycmp1(const char *s1,const char* s2){
	int idx=0;
	while(s1[idx]==s2[idx]&&s1[idx]!='\0'){
		idx++;
	}
	return s1[idx]-s2[idx];
}

int mycmp2(const char *s1,const char* s2){
	int ret=0;
	while(*s1==*s2&&*s1!='\0'){
		*s1++;
		*s2++;
	}
	return *s1-*s2;
}

int mycpy1(char* dst,const char* src){
	int idx=0;
	while(src[idx]){
		dst[idx]=src[idx];
		idx++;
	}
	dst[idx]='\0';
	return *dst;
}

int mycpy2(char* dst,const char* src){
	char* ret=dst;
	while(*dst++=*src++);
	*dst='\0';
	return *ret;
}

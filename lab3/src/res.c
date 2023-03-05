#include <stdio.h> 
int main()
{ 
printf("%d",15);
int c = 10;
int a = 5*2/4;
int b = 5+5;
printf("%d",a);
printf("%s","\n");
if(a>b) {
printf("%s","bigger");
}
else{
printf("%s","smaller");
}
char* name = "Name";
if(c==b) {
printf("%s","c == b");
}
else if(c>b){
printf("%s","c > b");
}
else{
printf("%s","Don't known");
}
printf("%s","Hello World\n");
printf(name);
printf("%s","\n");
if(5>4 || 0) {
printf("%s","Yes 5 > 4\n");
}
else{
while(b>a && 1){
 a = a+1;
}
}
printf("%s","End");
}
#include<stdio.h>
int main(){
    int i;
    int answer=0;
    
    for(i=1;i<1000;i++){
    //Checking the condition whether the numbers are mulitple of 3 or 5 using the modulo operator.
        if(i%3 == 0 || i%5 == 0){
        answer = answer + i;
        }
    }
    printf("%d\n",answer);
}

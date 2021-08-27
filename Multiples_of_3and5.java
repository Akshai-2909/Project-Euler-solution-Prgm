class main{
  public static void main(String[] args){
    int a = 0;
    for(int i = 0;i<1000;i++){
      if(i%3==0 || i%5==0){
        a = a+i;
      }
    }
    System.out.print(a);           //Output a = 233168
  }
}

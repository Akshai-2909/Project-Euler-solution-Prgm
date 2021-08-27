class main{
  public static void main(String[] args){
    int sumOfSquares = 0;
    int result = 0;
    int squareOfSum  = 0;
    for(int i = 0;i<=100;i++){
      sumOfSquares += (i*i);
      squareOfSum += i;
    }
    
    result = (squareOfSum*squareOfSum)-(sumOfSquares);
    System.out.print(result);
  }
}
    

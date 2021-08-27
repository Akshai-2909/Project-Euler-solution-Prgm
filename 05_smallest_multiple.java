class main{
	public static void main(String[] args){
		       int a = 1;
		first: while(a!=0){
			        for(int i = 1;i<=20;i++){
				          if(a%i==0){
					            if(i==20){
					              System.out.println(a);
					              break first;
					          }
					            continue;
				          }
				          else{
					            a++;
					            break;
				          }
	           }
	        }
  }
}

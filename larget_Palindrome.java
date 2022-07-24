class larget_Palindrome{
    public static void main(String[] args){
	int one = 100;
	int two = 100;
	for(int i = one; i<=999;i++){
	    for(int j = two;j<=999;j++){
			int ans = i*j;
			if(isPalindrome(ans)){
			    System.out.println(ans);
				System.out.println(i+" , "+j);
			}
	    }
	}
    }


    public static boolean isPalindrome(int a){
	String s = Integer.toString(a);
	String temp = "";
	for(int i  = s.length()-1;i>=0;i--){
	    temp +=s.charAt(i);
	}

	if(temp.equals(s)){
	    return true;

	}
	return false;
    }
}

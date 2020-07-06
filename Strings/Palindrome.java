class Palindrome{
	//input String \
	//output true if palindrome else false
	// cases....input : malayalam
	//output: true
	//input : vivek
	//output : false
	//input : Able was I ere I saw Elba
	//input : MALAYalam
	//output : true
	public static void main(String[] args){
		Palindrome palind = new Palindrome();
		String[] input = {"malayalam","vivek","Able was I ere I saw Elba","MALAYalam"};
		for(String s : input){
		System.out.println(palind.findPalindromeOrNot(s));
		}
	}
	public boolean findIsPalindrome(String input){
		char[] inputArr = input.toLowerCase().toCharArray();
		for(int i=0;i<inputArr.length;i++){
			for(int j=inputArr.length-(i+1);j>=0;j--){
				if(!(inputArr[i] == inputArr[j])){
					return false;
				}
				break;
			}
		}
		return true;
	}
	
	public boolean findPalindromeOrNot(String input){
		String lowerCase = input.toLowerCase();
		//char[] inputArr = input.toLowerCase().toCharArray();
		Integer inputLength = lowerCase.length();
		for(int i=0;i<inputLength/2;i++){
			if(lowerCase.charAt(i) != lowerCase.charAt(inputLength-(i+1))){
				return false;
			}
		}
		return true;
	}
}
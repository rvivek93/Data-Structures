import java.util.*;
//import java.util.Map;
class UniqueLetters{
	//input that accepts a string
	//output true if letters in strings is unique
	// else false
	// input string is casesensitive
	// test cases : abcd, out : true
	// input : AaBb, out : true
	// input : HelloWorld , out : false
	public static void main(String args[]){
		UniqueLetters unique = new UniqueLetters();
		//System.out.print(unique.findIsUnique("AaBb"));
		System.out.print(unique.findIsUniqueUsingSet("AaBb"));
		
	}
	
	public boolean findIsUnique(String input){
		//1. convert to char array the input string
		char[] inputArr = input.toCharArray();
		//2. Iterate over the char array and add to map with key as char and value as count.
		Map<Character, Integer> charMap = new HashMap<>();
		int count = 1;
		for(int i=0;i<inputArr.length;i++){
			System.out.println(inputArr[i]);
			if(charMap.containsKey(inputArr[i])){
				return false;
				//charMap.put(inputArr[i],charMap.get(inputArr[i])+1);
			}else{
			charMap.put(inputArr[i],count);
			}
		}
		return true;
	}
	
	/*public boolean findIsUniqueUsingSet(String input){
		//1. convert to char array the input string
		char[] inputArr = input.toCharArray();
		// A Set will only contain unique objects.
		Set<Character> set = new HashSet<>(Arrays.asList(inputArr));
		return inputArr.length == set.size();		
	}*/
}
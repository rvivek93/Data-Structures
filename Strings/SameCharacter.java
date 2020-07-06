import java.util.*;
class SameCharacter{
	//input two Strings
	//output true if both Charcters in Strings are same else false
	// cases....input : 1- abcd 2- abcd 
	//output: true
	//input : 1- abc 2- cba
	//output : true
	//input : 1- abc 2 - Abc
	//output : false
	//input : 1- abc 2- abca
	//output : false
	//input : 1- a1 b2 2- b1 a2
	//output : true
	public static void main(String[] args){
		SameCharacter sameCharc = new SameCharacter();
		String[] inputArray1 = {"abcd","abc","abc","abc","a1 b2"};
		String[] inputArray2 = {"abcd","cba","Abc","abca","b1 a2"};
		for(int k=0;k<inputArray1.length;k++){
			
				System.out.println(sameCharc.containsSameCharctersWithArray(inputArray1[k],inputArray2[k]));			
		}
	}
	public boolean containsSameCharacters(String input1, String input2){
		Map<Character, Integer> charMap = new HashMap<>();
		int count = 1;
		for(int i=0;i<input1.length();i++){
			if(charMap.containsKey(input1.charAt(i))){
				charMap.put(input1.charAt(i),charMap.get(input1.charAt(i)+1));
			}else{
			charMap.put(input1.charAt(i),count);
			}
		}
		for(int j=0;j<input2.length();j++){
			if(charMap.containsKey(input2.charAt(j))){
				charMap.put(input2.charAt(j),charMap.get(input2.charAt(j))-1);
				if(charMap.get(input2.charAt(j)) < 0){
					return false;
				}
			}else{
				return false;
			}
		}
		return true;
	}
	
	public boolean containsSameCharctersWithArray(String input1, String input2){
		
		if(input1.length() != input2.length())
			return false;
		char[] inputArray1 = input1.toCharArray();
		char[] inputArray2 = input2.toCharArray();
		
		Arrays.sort(inputArray1);
		Arrays.sort(inputArray2);
		
		String inputString1 = new String(inputArray1);
		String inputString2 = new String(inputArray2);
		
		System.out.println(inputString1);
		System.out.println(inputString2);
		
		return inputString1.equals(inputString2);
			
	}
	
}
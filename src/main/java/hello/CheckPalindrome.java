package hello;

public class CheckPalindrome {
	static final int totalChar = 256; 

	
	public boolean canFormPalindrome(String str) 
	{ 
		
		int[] count = new int[totalChar]; 
 
		for (int i = 0; i < str.length(); i++) 
			count[str.charAt(i)]++; 

		int odd = 0; 
		for (int i = 0; i < totalChar; i++) { 
			if ((count[i] & 1) != 0) 
				odd++; 

			if (odd > 1) 
				return false; 
		} 
 
		return true; 
	}
	
	 public boolean isPalindrom(String word) {
		   
		     return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
		}
	
	
}

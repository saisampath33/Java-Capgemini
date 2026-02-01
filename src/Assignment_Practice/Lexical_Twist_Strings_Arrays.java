package Assignment_Practice;

import java.util.LinkedHashSet;

public class Lexical_Twist_Strings_Arrays {
	
	public static String lexicaltwist(String firstWord,String secondWord) {
		StringBuilder firstreverse = new StringBuilder(firstWord).reverse();
		if(firstreverse.toString().equalsIgnoreCase(secondWord)) {
			String res = firstreverse.toString().toLowerCase();
			res = res.replaceAll("[aeiou]", "@");
			return res;
		}
		String combine = (firstWord + secondWord).toUpperCase();
		String vowels = "AEIOU";
		int vowcount =0,consocount =0;
		for(Character ch : combine.toCharArray()) {
		if(vowels.indexOf(ch)!=-1) {
			vowcount++;
		}else {
			consocount++;
		}
		}
		
		if(vowcount>consocount) {
			StringBuilder res1 = new StringBuilder();
			
			LinkedHashSet<Character> set1 = new LinkedHashSet<>();
			
			
				for(int i=0;i<combine.length();i++) {
					if(vowels.indexOf(combine.charAt(i))>=0) {
					set1.add(combine.charAt(i));
					}
					if(set1.size()==2) break;
				}
				for(Character ch:set1) {
					res1.append(ch);
				}
				return res1.toString();
			
		}else if(consocount>vowcount) {
			StringBuilder res2 = new StringBuilder();
			LinkedHashSet<Character> set2 = new LinkedHashSet<>();
			
			for(int i=0;i<combine.length();i++) {
				if(vowels.indexOf(combine.charAt(i))==-1) {
					set2.add(combine.charAt(i));
				}
				if(set2.size()==2) break;
			}
			for(Character ch:set2) {
				res2.append(ch);
			}
			
			return res2.toString();
		}
		return "Vowels and Conso are equal";
	}
	public static void main(String[] args) {
		
		System.out.println(lexicaltwist("Apple","Orange")); //conso more than vowels
		System.out.println(lexicaltwist("Open","Source")); //vowels and conso are equal
		System.out.println(lexicaltwist("Idea","Ocean")); //vowels more than conso
	}

}

package Strings;

import java.util.*;

public class String_Problems {

	public static void length(String s) {
		int cnt = 0;
		char[] ch = s.toCharArray();
		for (char c : ch) {
			cnt++;
		}
		System.out.println("The length is: " + cnt);
	}

	public static String reverse(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
//		System.out.println("The reverse is: "+rev);
		return rev;
	}

	public static void vowelsandcons(String s) {
		int vowels = 0, cons = 0;
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (c >= 'a' && c <= 'z') {
				if ("aeiou".indexOf(c) != -1) {
					vowels++;
				} else {
					cons++;
				}
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + cons);
	}

	public static void numberofwords(String s) {
		int cnt = 0;
		String[] str = s.split(" ");
		for (String i : str) {
			cnt++;
		}
		System.out.println("The words are: " + cnt);
	}

	public static void upperandlower(String s) {
		String lower = s.toLowerCase();
		String upper = s.toUpperCase();
		System.out.println("Lower: " + lower + " Upper: " + upper);
	}

	public static void removewhite(String s) {
		s = s.replace(" ", "");
		System.out.println(s);
	}

	public static void duplicate(String s) {
		HashMap<Character, Integer> mpp = new HashMap<>();
		for (char c : s.toCharArray()) {
			mpp.put(c, mpp.getOrDefault(c, 0) + 1);
		}
		System.out.println("Duplicate Characters: ");
		for (Map.Entry<Character, Integer> entry : mpp.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "->" + entry.getValue());
			}
		}
	}

	public static void frequency(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println("Frequency is: ");
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
	}

	public static void anagrams(String s1, String s2) {
		HashMap<Character, Integer> mpp1 = new HashMap<>();
		HashMap<Character, Integer> mpp2 = new HashMap<>();
		for (char c1 : s1.toCharArray()) {
			mpp1.put(c1, mpp1.getOrDefault(c1, 0) + 1);
		}
		for (char c2 : s2.toCharArray()) {
			mpp2.put(c2, mpp2.getOrDefault(c2, 0) + 1);
		}
		if (mpp1.equals(mpp2)) {
			System.out.println("They are anagrams");
		} else {
			System.out.println("They are not anagrams");
		}
	}

	public static void removecharacter(String s, char c) {
		s = s.replace(String.valueOf(c), "");
		System.out.println(s);
	}

	public static void removeduplicates(String s) {
		HashMap<Character, Integer> mpp = new HashMap<>();
		for (char c : s.toCharArray()) {
			mpp.put(c, mpp.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : mpp.entrySet()) {
			if (entry.getValue() > 1) {
				s = s.replace(String.valueOf(entry.getKey()), "");
			}
		}
		System.out.println(s);
	}

	public static void first_non_repeating_char(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		boolean found = false;
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1) {
				System.out.println("first_non_repeating_char " + s.charAt(i));
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Every character is repeating");
		}
	}

	public static void reverse_word_in_string(String s) {
		String[] str = s.split(" ");
		String res = "";
		for (String s1 : str) {
			res += reverse(s1) + " ";
		}
		System.out.println(res);
	}

	public static void reverse_word_in_string_using_stack(String s) {
		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				st.push(s.charAt(i));
			} else {
				while (!st.isEmpty()) {
					sb.append(st.pop());
				}
				sb.append(" ");
			}
		}
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		System.out.println(sb.toString().trim());
	}

	public static String capitalize_first_letter_word(String s) {
		if (s.isEmpty() || s == null) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
		String[] str = s.split(" ");
		for (String s1 : str) {
			if (s1.length() > 0) {
				sb.append(s1.substring(0, 1).toUpperCase()).append(s1.substring(1)).append(" ");
			}
		}
		return sb.toString().trim();
	}

	public static void longest_word_Sentence(String s) {
		String[] str = s.split(" ");
		int maxi = 0;
		String res = "";
		for (String s1 : str) {
			if (s1.length() > maxi) {
				maxi = s1.length();
				res = s1;
			}
		}
		System.out.println("Longest length word is: " + res);
		System.out.println("Longest Length is: " + maxi);
	}
	
	public static void count_occurences_of_substring() {
		String mainString="abbbbbabacabababababac";
		String subString="abac";
		int count=0;
		//mainString.length()-subString.length() = if we keep mainstring length then we get string index out of bounds the substring length is 4 na so we should stop loop before 4 char
		for(int i=0;i<=mainString.length()-subString.length();i++) {
			if(mainString.substring(i,i+subString.length()).equals(subString)) {
				count++;
			}
		}
		System.out.println("count_occurences_of_substring: "+count);
	}
	public static void main(String[] args) {
		String s1 = "HHellooo!!";
		System.out.println(s1);
		String s2 = "Hi and Namasteeeeee everyone";

		length(s1);
		reverse(s1);
		vowelsandcons(s1);
		numberofwords(s2);
		upperandlower(s1);
		removewhite(s2);
		duplicate(s1);
		frequency(s1);
		String a = "seas";
		String b = "asse";
		anagrams(a, b);
		removecharacter(s1, 'l');
		String e = "heee0";
		removeduplicates(e);
		first_non_repeating_char(s1);
		String sentence = "I  love java";
		reverse_word_in_string(sentence);
		reverse_word_in_string_using_stack(s2);
		System.out.println("First letter capital: " + capitalize_first_letter_word(sentence));
		longest_word_Sentence(s2);
		count_occurences_of_substring();
	}

}

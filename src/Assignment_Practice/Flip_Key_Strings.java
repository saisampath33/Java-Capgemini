package Assignment_Practice;

public class Flip_Key_Strings {

        public static String cleanseAndInvert(String text) {

        if (text == null || text.length() < 6) {
            return "Invalid Input";
        }

        for (char character : text.toCharArray()) {
            if (!Character.isLetter(character)) {
                return "Invalid Input";
            }
        }

        String lowercaseText = text.toLowerCase();
        StringBuilder oddAsciiCharacters = new StringBuilder();

        for (char character : lowercaseText.toCharArray()) {
            if (character % 2 != 0) {
                oddAsciiCharacters.append(character);
            }
        }

        oddAsciiCharacters.reverse();

        for (int index = 0; index < oddAsciiCharacters.length(); index++) {
            if (index % 2 == 0) {
                oddAsciiCharacters.setCharAt(
                        index,
                        Character.toUpperCase(oddAsciiCharacters.charAt(index))
                );
            }
        }

        return oddAsciiCharacters.toString();
    }
    
    public static void main(String[] args) {
    		System.out.println("Clean String is: "+cleanseAndInvert("HelloWorld"));
    }
}

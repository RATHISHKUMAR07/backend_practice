public class StringAdder {

    public static void main(String[] args) {
        String s = "b3c6d1";  // Example input
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); ) {
            char c = s.charAt(i);
            int num = 0;
            
            // Check if the next two characters are digits
            if (i + 2 < s.length() && s.charAt(i + 1) -'0' < 10 && s.charAt(i + 2) -'0' < 10) {
                num = (s.charAt(i + 1) - '0') * 10 + (s.charAt(i + 2) - '0');
                i += 3;  // Skip the processed characters
            }
            // Check if the next character is a digit
            else if (i + 1 < s.length() && s.charAt(i + 1) -'0' < 10) {
                num = s.charAt(i + 1) - '0';
                i += 2;  // Skip the processed character
            } else {
                i++;  // Skip non-digit character
            }

            // Append the character 'c' 'num' times to the StringBuilder
            for (int j = 0; j < num; j++) {
                sb.append(c);
            }
        }
        
        System.out.println(sb.toString());  // Print the result
    }
}

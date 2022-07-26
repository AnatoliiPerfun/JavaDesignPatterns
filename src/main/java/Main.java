import java.util.HashSet;
import java.util.Set;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/5/2022 - 4:47 PM
 */

public class Main {
    public static void main(String[] args) throws Exception {

    }
    public int lengthOfLongestSubstring(String s) {
        // Base condition
        if (s == null || s.equals("")) {
            return 0;
        }
        // Starting window index
        int start = 0;
        // Ending window index
        int end = 0;
        // Maximum length of substring
        int maxLength = 0;
        // This set will store the unique characters
        Set<Character> uniqueCharacters = new HashSet<>();
        // Loop for each character in the string
        while (end < s.length()) {
            if (uniqueCharacters.add(s.charAt(end))) {
                end++;
                maxLength = Math.max(maxLength, uniqueCharacters.size());
            } else {
                uniqueCharacters.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}
package rocks.zipcode.assessment2.fundamentals;

import java.util.Arrays;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String reversedString = "";
        for(int i = 0; i < string1.length(); i++){
            reversedString += string1.charAt(string1.length() - i - 1);
        }
        return reversedString;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String reversed1 = reverse(string1);
        String reversed2 = reverse(string2);

        return reversed1 + reversed2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String[] targetCharacters = charactersToRemove.split("");
        String[] originalString = string.split("");
        System.out.println(Arrays.toString(targetCharacters));
        String removedString = "";
        for(int i = 0; i < originalString.length; i++){
            Boolean includedInRemove = false;
            for(int j = 0; j < targetCharacters.length; j++){
                if(originalString[i].equals(targetCharacters[j])){
                    includedInRemove = true;
                }
            }
            if(!includedInRemove){
                removedString += originalString[i];
            }
        }

        return removedString;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String removedString = removeCharacters(string, charactersToRemove);
        String reversedRemovedString = reverse(removedString);

        return reversedRemovedString;
    }
}

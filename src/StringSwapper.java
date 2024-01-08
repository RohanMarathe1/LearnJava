//Create a function that takes a string and returns a new string with its first and last characters swapped, 
// except under two conditions:
//If the length of the string is less than two, return "Incompatible.".
//If the first and last characters are the same, return "Two's a pair.".
public class StringSwapper {
    public String swapFirstAndLast(String str) {
        if (str.length() < 2) {
            return "Incompatible.";
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return "Two's a pair.";
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        String middleString = str.substring(1, str.length() - 1);

        String swappedString = lastChar + middleString + firstChar;

        return swappedString;
    }
}

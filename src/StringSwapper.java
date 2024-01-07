public class StringSwapper {
    public String swapFirstAndLast(String str) {
        if (str.length() < 2) {
            return "Incompatible.";
        }
        if (str.charAt(0) == str.charAt(str.length() - 1))
            return "Two's a pair.";

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        String middleString = str.substring(1, str.length() - 1);

        String swappedString = lastChar + middleString + firstChar;

        return swappedString;
    }
}

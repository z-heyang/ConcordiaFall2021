package ca.concordia.cejv416.fall2021.Class_10;

public class LastWord {

    public static void main(String[] args) {

        String lastWord = getLastWord("Red");
        System.out.println(lastWord);
    }

    /**
     * This function finds the last word in the string and returns it.
     * @param input This is the input string.
     * @return This is the last word from the input string.
     */
    public static String getLastWord(String input)
    {
        input = input.trim();

        int start = 0;  // Start of the found word.
        int end = input.length() - 1; // End of the found word.

        for(int i = end; i >= 0; i--)
        {
            if(input.charAt(i) == ' ')
            {
                start = i + 1;
                break;
            }
        }

        return input.substring(start, end + 1);
    }
}

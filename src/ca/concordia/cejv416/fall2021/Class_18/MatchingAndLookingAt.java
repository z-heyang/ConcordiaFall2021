package ca.concordia.cejv416.fall2021.Class_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingAndLookingAt {

    private static final String REGEX = "foo";
    private static final String INPUT = "fooooooooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main( String args[] ) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.println("Current REGEX is: "+REGEX);
        System.out.println("Current INPUT is: "+INPUT);

        System.out.println("lookingAt(): "+matcher.lookingAt()); // Match partially OK.
        System.out.println("matches(): "+matcher.matches());  // Must match entire thing.
    }


}

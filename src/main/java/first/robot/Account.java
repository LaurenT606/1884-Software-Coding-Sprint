package first.robot;

public class Account {
    private String username;

    /**
     * Creates a username based on the parameter requestedName. If the
     * username is unavailable, appends successive integers, beginning
     * with 1, to requestedName until an available username is found,
     * as described in part (a).
     */
    public Account(String requestedName) {

        int counter = 0;
        if (isAvailable(requestedName)) {
            username = requestedName;

        } else {
            while(!isAvailable(requestedName+counter)) {
                counter++;
            }

            username = requestedName + counter;
        }

        //Aarav helped with the while loop

    }

    /**
     * Returns true if the parameter str is an available username;
     * returns false otherwise.
     */
    public static boolean isAvailable(String str)
    { /* implementation not shown */
        return false;//ts just so it wouldnt give an error
    }

    /**
     * Returns a shortened version of username with each hyphen ("-")
     * and the character before it removed, as described in part (b)
     * Preconditions: username does not start or end with a hyphen.
     * username does not contain consecutive hyphens.
     * username.length() >= 2
     * Postcondition: username is unchanged.
     */
    public String getShortenedName(String nameToBeShortened) {
        String shortenedName = "";
        int hyphenLocator;
        for (int i = 0; i < nameToBeShortened.length(); i++) {
            if (nameToBeShortened.charAt(i) == '-') {
                hyphenLocator = i;
                shortenedName.concat(nameToBeShortened.substring(0,i-1));
            }
        }

        return shortenedName;
    }
}
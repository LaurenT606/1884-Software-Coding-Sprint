package first.robot;

import java.util.ArrayList;

public class Account {

    private String username;

    /**
     * Creates a username based on the parameter requestedName. If the
     * username is unavailable, appends successive integers, beginning
     * with 1, to requestedName until an available username is found,
     * as described in part (a).
     */


    public Account(String requestedName) {
        if (isAvailable(requestedName)) {
           username = requestedName;
        } else {
            int num = 1;
            while (!isAvailable(requestedName + num)) {
                num++;
            }
            username = requestedName + num;
        }
    }

    /**
     * Returns true if the parameter str is an available username;
     * returns false otherwise.
     */
    public static boolean isAvailable(String str)
    { return true;/* implementation not shown */ }

    /**
     * Returns a shortened version of username with each hyphen ("-")
     * and the character before it removed, as described in part (b)
     * Preconditions: username does not start or end with a hyphen.
     * username does not contain consecutive hyphens.
     * username.length() >= 2
     * Postcondition: username is unchanged.
     */
    public String getShortenedName() {
        ArrayList<String> name = new ArrayList<>();
        int index = 0;
        while (index < username.length()) {
            name.add(Character.toString(username.charAt(index)));
            index++;
        }

        index = 0;
        while (index < username.length()) {
            if (name.get(index).equals("-")) {
                if (index>0){
                    name.set(index-1, "-");
                }
            }
            index++;
        }

        return String.join("", name).replaceAll("-", "");
    }
}
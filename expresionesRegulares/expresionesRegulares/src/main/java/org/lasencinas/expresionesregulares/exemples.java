package org.lasencinas.expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exemples {

    public static void main(String[] args) {
        // Create a Pattern object
        String regex = "[a-z]@.";
        Pattern p = Pattern.compile(regex);
// String to perform the match
        String str = "abc@yahoo.com,123@cnn.com,ksharan@jdojo.com";
// Get a matcher object using Pattern object p for str
        Matcher m = p.matcher(str);

        if (m.find()) {
            // str is the string we are looking into
            String foundStr = str.substring(m.start(), m.end());
            System.out.println("Found string is:" + foundStr);
        }

        if (m.find()) {
            String foundStr = m.group();
            System.out.println("Found text is:" + foundStr);
        }
    }

}

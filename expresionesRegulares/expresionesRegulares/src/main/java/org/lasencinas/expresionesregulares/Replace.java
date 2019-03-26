package org.lasencinas.expresionesregulares;

public class Replace {

    public static void main(String[] args) {
        String regex = ".@.";
// newStr will contain "webmaste***dojo.com"
        String newStr = "webmaster@jdojo.com".replaceAll(regex, "***");
// newStr will contain "***"
        newStr = "A@B".replaceAll(regex, "***");
// newStr will contain "***and***"
        newStr = "A@BandH@G".replaceAll(regex, "***");
// newStr will contain "B%T" (same as the original string)
        newStr = "B%T".replaceAll(regex, "***");

// newStr will contain "webmaste***dojo.com"
        String newStrr = "webmaster@jdojo.com".replaceFirst(regex, "***");

// newStr will contain "***"
        newStrr = "A@B".replaceFirst(regex, "***");

// newStr will contain "***andH@G"
        newStrr = "A@BandH@G".replaceFirst(regex, "***");

// newStr will contain "B%T" (same as the original string)
        newStrr = "B%T".replaceFirst(regex, "***");
    }
}

package sda.java.basics;

import java.util.regex.Pattern;

public class StringUtils {

    static String prepareString(String stringToBePrepared) {

        String readystring = stringToBePrepared
                .replaceAll("[-,.]", "")
//                .replaceAll(",", "")
//                .replaceAll("\\.", "")
                .toLowerCase();

        return readystring;
    }
}

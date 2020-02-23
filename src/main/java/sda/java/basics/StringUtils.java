package sda.java.basics;

import java.util.regex.Pattern;

public class StringUtils {

    String prepareString(String stringToBePrepared) {

        String readystring = stringToBePrepared.replaceAll("\\s\\W" + "." + ",", "").toLowerCase();


        return readystring;
    }
}

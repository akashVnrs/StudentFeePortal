/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author akash
 */
public class MobileValidation {

    public static boolean isValid(String s) {

        // The given argument to compile() method
        // is regular expression. With the help of
        // regular expression we can validate mobile
        // number.
        // The number should be of 10 digits.
        // Creating a Pattern class object
        Pattern p = Pattern.compile("^\\d{10}$");

        // Pattern class contains matcher() method
        // to find matching between given number
        // and regular expression for which
        // object of Matcher class is created
        Matcher m = p.matcher(s);

        // Returning boolean value
        return (m.matches());
    }

}

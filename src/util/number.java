/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author akash
 */
// Java program to check if a string
// contains only digits
import java.util.regex.*;

public class number {

	// Function to validate URL
	// using regular expression
	public static boolean
	onlyDigits(String str)
	{
		// Regex to check string
		// contains only digits
		String regex = "[0-9]+";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the string is empty
		// return false
		if (str == null) {
			return false;
		}

		// Find match between given string
		// and regular expression
		// using Pattern.matcher()
		Matcher m = p.matcher(str);

		// Return if the string
		// matched the ReGex
		return m.matches();
	}

//	// Driver Code
//	public static void main(String args[])
//	{
//		// Given string str
//		String str = "1234";
//
//		// Function Call
//		System.out.println(onlyDigits(str));
//	}
}


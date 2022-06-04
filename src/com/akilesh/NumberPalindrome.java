package com.akilesh;

public class NumberPalindrome {

    public static String isPalindrome(int number) {
        // Taking out the negative values.
        number = Math.abs(number);

        // Validating parameter
        if (number < 10) {
            return "Please enter a two digit number.";
        }
        // A number is a palindrome if the reverse of it is equal to the original.
        // Going to store all the digits in reverse order in the following variable.
        String reversedNumber = "";

        // If we find remainder of 121 / 10, then it is 1. Then if we divide 121 by 10 then, it is 12.1, then if we
        // store it in an int variable, then it is 12. We can do the same and separate all the digits. If we have
        // only one digit pending, that is less than 10, then we can use it directly.

        // Variable to store the number divided by 10, first keeping the number itself in it.
        int numberAfterDivideByTen = number;

        // Doing a while loop and implementing the algorithm mentioned above.
        while (numberAfterDivideByTen > 9) {
            // Finding the ones digit.
            int currentOnesDigit = numberAfterDivideByTen % 10;
            String currentOnesDigitString = currentOnesDigit + ""; // This converts it to string.
            reversedNumber += currentOnesDigitString; // Adding to the string.
            numberAfterDivideByTen = numberAfterDivideByTen / 10;
        }
        // If we reached the last digit, then it won't be added to the string as we won't even go into the loop.
        // So adding it here.
        reversedNumber += numberAfterDivideByTen;

        // Converting original number to string, so that we can test for equality with reversed number which is string.
        String originalNumberString = number + "";

        if (reversedNumber.equals(originalNumberString)) {
            return number + " is a palindrome.";
        } else {
            return number + " is not a palindrome.";
        }
    }
}

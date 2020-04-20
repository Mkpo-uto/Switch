package com.company;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int reverse = 0, lastDigit = 0, palindrome = number;

        while (palindrome != 0) {
            lastDigit = palindrome % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            palindrome = palindrome / 10;
        }

        if(reverse == number){
            return true;
        }

        return false;


    }
}

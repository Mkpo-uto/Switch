package com.company;

public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2){
        if(((num1 < 10) ||(num1 > 99)) || ((num2 < 10) ||(num2 > 99))){
            return false;
        }

        int firstDigit, lastDigit, first, last;
        firstDigit = num1 / 10; lastDigit = num1 % 10;
        first = num2 / 10; last = num2 % 10;

        if(firstDigit == first || firstDigit == last || lastDigit == first || lastDigit == last){
            return true;
        }
        return false;
    }
}

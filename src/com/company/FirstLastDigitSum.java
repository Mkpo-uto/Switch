package com.company;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        int sum = 0, lastDigit;
        if(number < 0){
            return -1;
        }

        if(number < 10){
           sum = number + number;
           return sum;
        }

        lastDigit = number % 10;
        while(number >= 10) {
            number = number / 10;
        }
        sum = number + lastDigit;
        return sum;
    }
}

package com.company;

public class NumberToWords {

    public static void numberToWords(int number){

        int lastDigit, reversedNumber;
        if(number < 0){
            System.out.println("Invalid Value");
        } else {
            reversedNumber = reverse(number);
            while (number >= 0){
                lastDigit = reversedNumber % 10;
                switch (lastDigit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Number");
                        break;
                }
                reversedNumber /= 10;
                number = number / 10;
                if(number == 0){
                    break;
                }
            }
        }
    }

    public static int reverse(int number){
        int reversed = 0;

        while (number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;

    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        } else {
            int count = 0;
            while (number >= 0){
                count++;
                number /= 10;
                if(number == 0){
                    break;
                }
            }
            return  count;
        }
    }
}

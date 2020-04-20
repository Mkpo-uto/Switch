package com.company;

public class Main {

    public static void main(String[] args) {

//        int switchValue = 3;
//	    switch (switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("was a 3, or a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }

//        int charValue = 'F';
//	    switch (charValue){
//            case 'A':
//                System.out.println("A is found");
//                break;
//            case 'B':
//                System.out.println("B is found");
//                break;
//            case 'C': case 'D': case 'E':
//                System.out.println(charValue + " is found");
//                break;
//
//            default:
//                System.out.println("A,B,C,D or E not found");
//                break;
//        }
//
//        String month = "June";
//	    switch (month.toLowerCase()){
//            case "january":
//                System.out.println("Jan");
//                break;
//            case "june":
//                System.out.println("Jun");
//                break;
//            default:
//                System.out.println("Not sure");
//        }

//        DayOfTheWeekChallenge.printDayOfTheWeek(-1);
//        DayOfTheWeekChallenge.printDayOfTheWeek(0);
//        DayOfTheWeekChallenge.printDayOfTheWeek(1);
//        DayOfTheWeekChallenge.printDayOfTheWeek(2);
//        DayOfTheWeekChallenge.printDayOfTheWeek(3);
//        DayOfTheWeekChallenge.printDayOfTheWeek(4);
//        DayOfTheWeekChallenge.printDayOfTheWeek(5);
//        DayOfTheWeekChallenge.printDayOfTheWeek(6);
//        DayOfTheWeekChallenge.printDayOfTheWeek(7);

//        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));
//
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(6, 2020));

//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//
//	    for(int interestRate = 2; interestRate <= 8; interestRate++){
//            System.out.println("10,000 at " + interestRate + "% interest = " + String.format("%.2f",calculateInterest(10000, interestRate)));
//        }
//
//        System.out.println("******************************************");
//
//        for(int interestRate = 8; interestRate >= 2; interestRate--){
//            System.out.println("10,000 at " + interestRate + "% interest = " + String.format("%.2f",calculateInterest(10000, interestRate)));
//        }
//
//	    for(int i = 0;i < 5;i++){
//            System.out.println("Loop " + i + " hello!");
//        }
//
//        int count = 0;
//	    for(int j = 0; j < 10; j++){
//	        boolean prime = isPrime(j);
//	        if(prime == true){
//                count += 1;
//                System.out.println(j + " is a prime number");
//                if (count == 10){
//                    System.out.println("Exiting for loop");
//                    break;
//                }
//            }
//        }
//        int sum = 0, numCount = 0;
//	    for(int num = 1; num <= 1000; num++){
//	        if((num % 3 == 0) && (num % 5 == 0)){
//                numCount++;
//                sum += num;
//	            System.out.println(num);
//            }
//            if(numCount == 5){
//                    System.out.println("Exiting loop");
//                    break;
//            }
//        }
//        System.out.println("Sum of numbers found is " + sum);

//        System.out.println(SumOddRange.sumOdd(1,100));
//        System.out.println(SumOddRange.sumOdd(-1,100));
//        System.out.println(SumOddRange.sumOdd(100,100));
//        System.out.println(SumOddRange.sumOdd(13,13));
//        System.out.println(SumOddRange.sumOdd(100,-100));
//        System.out.println(SumOddRange.sumOdd(100,1000));
//
//        int count = 1;
//        while(count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count= 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        }while(count != 6);
//
//        int number = 4, countEven = 0;
//       int finishNumber = 20;
//
//        while(number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number );
//            countEven++;
//            if(countEven >= 5){
//                break;
//            }
//
//        }
//
//        System.out.println("Total number of even numbers is " + countEven);
//
//        System.out.println("The sum of digits in number 125 is " + DigitSumChallenge.sumDigits(125));
//        System.out.println("The sum of digits in number -125 is " + DigitSumChallenge.sumDigits(-125));
//        System.out.println("The sum of digits in number 4 is " + DigitSumChallenge.sumDigits(4));
//        System.out.println("The sum of digits in number 32123 is " + DigitSumChallenge.sumDigits(32123));

//        System.out.println(NumberPalindrome.isPalindrome(-1221));
//        System.out.println(NumberPalindrome.isPalindrome(707));
//        System.out.println(NumberPalindrome.isPalindrome(11212));

//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252));
//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-252));
//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257));
//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0));
//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));
//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-10));

//        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
//        System.out.println(EvenDigitSum.getEvenDigitSum(252));
//        System.out.println(EvenDigitSum.getEvenDigitSum(-22));

//        System.out.println(SharedDigit.hasSharedDigit(12, 23));
//        System.out.println(SharedDigit.hasSharedDigit(9, 99));
//        System.out.println(SharedDigit.hasSharedDigit(15, 55));

//        System.out.println(LastDigitChecker.hasSameLastDigit(41,22,71));
//        System.out.println(LastDigitChecker.hasSameLastDigit(23,32,42));
//        System.out.println(LastDigitChecker.hasSameLastDigit(9,99,999));
//        System.out.println(LastDigitChecker.isValid(10));
//        System.out.println(LastDigitChecker.isValid(468));
//        System.out.println(LastDigitChecker.isValid(1051));

//        System.out.println(GreatestCommonDivisor.greatestCommonDivisor(12, 30));
//        System.out.println(GreatestCommonDivisor.greatestCommonDivisor(25, 15));
//        System.out.println(GreatestCommonDivisor.greatestCommonDivisor(9, 18));
//        System.out.println(GreatestCommonDivisor.greatestCommonDivisor(81, 153));

//        FactorPrinter.printFactors(6);
//        FactorPrinter.printFactors(32);
//        FactorPrinter.printFactors(10);
//        FactorPrinter.printFactors(-1);
//        System.out.println(PerfectNumber.isPerfectNumber(6));
//        System.out.println(PerfectNumber.isPerfectNumber(28));
//        System.out.println(PerfectNumber.isPerfectNumber(5));
//        System.out.println(PerfectNumber.isPerfectNumber(-1));

//        System.out.println(NumberToWords.reverse(-121));
//        System.out.println(NumberToWords.reverse(1212));
//        System.out.println(NumberToWords.reverse(1234));
//        System.out.println(NumberToWords.reverse(100));
//        NumberToWords.numberToWords(123);
//        System.out.println();
//        NumberToWords.numberToWords(1010);
//        System.out.println();
//        NumberToWords.numberToWords(1000);
//        System.out.println();
//        NumberToWords.numberToWords(-12);
//        NumberToWords.numberToWords(0);
//        System.out.println(NumberToWords.getDigitCount(0));

//        String numberAsString = "2020.125";
//        System.out.println("numberAsString =" + numberAsString);

        //int number = Integer.parseInt(numberAsString);
//        double number = Double.parseDouble(numberAsString);
//        System.out.println("number = " + number);
//
//        numberAsString += 1;
//        number += 1;
//
//        System.out.println("numberAsString =" + numberAsString);
//        System.out.println("number = " + number);

        System.out.println(FlourPacker.canPack(-3, 2, 12));
        System.out.println(FlourPacker.canPack(2, 2, 11));
        System.out.println(FlourPacker.canPack(1, 0, 4));
        System.out.println(FlourPacker.canPack(1, 0, 5));
        System.out.println(FlourPacker.canPack(0, 5, 4));
        System.out.println(FlourPacker.canPack(2, 0, 9));
        System.out.println(FlourPacker.canPack(1, 5, 9));
        System.out.println(FlourPacker.canPack(1, 0, 6));


    }

    public static boolean isEvenNumber(int num){
        if(num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        for(int i = 2; i <= (long) Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

}

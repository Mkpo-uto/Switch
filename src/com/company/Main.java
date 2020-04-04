package com.company;

public class Main {

    public static void main(String[] args) {

        int switchValue = 3;
	    switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        int charValue = 'F';
	    switch (charValue){
            case 'A':
                System.out.println("A is found");
                break;
            case 'B':
                System.out.println("B is found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " is found");
                break;

            default:
                System.out.println("A,B,C,D or E not found");
                break;
        }

        String month = "June";
	    switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

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

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

	    for(int interestRate = 2; interestRate <= 8; interestRate++){
            System.out.println("10,000 at " + interestRate + "% interest = " + String.format("%.2f",calculateInterest(10000, interestRate)));
        }

        System.out.println("******************************************");

        for(int interestRate = 8; interestRate >= 2; interestRate--){
            System.out.println("10,000 at " + interestRate + "% interest = " + String.format("%.2f",calculateInterest(10000, interestRate)));
        }

	    for(int i = 0;i < 5;i++){
            System.out.println("Loop " + i + " hello!");
        }

        int count = 0;
	    for(int j = 0; j < 10; j++){
	        boolean prime = isPrime(j);
	        if(prime == true){
                count += 1;
                System.out.println(j + " is a prime number");
                if (count == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        for(int i = 2; i <= n/2;i++){
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

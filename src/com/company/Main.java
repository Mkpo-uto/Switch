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

        DayOfTheWeekChallenge.printDayOfTheWeek(-1);
        DayOfTheWeekChallenge.printDayOfTheWeek(0);
        DayOfTheWeekChallenge.printDayOfTheWeek(1);
        DayOfTheWeekChallenge.printDayOfTheWeek(2);
        DayOfTheWeekChallenge.printDayOfTheWeek(3);
        DayOfTheWeekChallenge.printDayOfTheWeek(4);
        DayOfTheWeekChallenge.printDayOfTheWeek(5);
        DayOfTheWeekChallenge.printDayOfTheWeek(6);
        DayOfTheWeekChallenge.printDayOfTheWeek(7);

    }


}

package com.company;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        boolean leapYear = false;
        if(year < 1 || year > 9999){
            return false;
        } else if(year >= 1 && year <= 9999){
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                leapYear = true;
            } else {
                leapYear = false;
            }
         }
        return leapYear;
    }

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12){
            return -1;
        }
        if(year < 1 || year > 9999){
            return -1;
        } else {
           boolean leapYear = isLeapYear(year);
           if(leapYear == true){
                switch(month){

                    case 2:
                        return 29;


                    case 4: case 9: case 6: case 11:
                        return 30;

                    default:
                        return 31;

                }


           } else {
                switch(month){
                    case 9:
                    case 4:
                    case 6:
                    case 11:
                        return 30;

                    case 2:
                        return 28;

                    default:
                        return 31;

                }
           }
        }
    }

}

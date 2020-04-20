package com.company;

/**
 * To be continued. The logic is flawed in this program
 */
public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int sum = 0, totalbigCount = 0;
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        } else {
           totalbigCount = bigCount * 5;
           sum = totalbigCount + smallCount;

           if(goal > totalbigCount){
               int diff =  goal - totalbigCount;
               if(diff < smallCount){
                   return true;
               }
           }

           if(smallCount > 0 && totalbigCount > 0){
               sum = smallCount + totalbigCount;
               if (sum > goal){
                   return true;
               }
           }
           if(sum > goal ){
               return false;
           } else if ( sum == goal){
               return true;
           } else if ( sum < goal){
               return false;
           }

           if ( smallCount > goal){
               return true;
           }
           return true;
        }
    }
}

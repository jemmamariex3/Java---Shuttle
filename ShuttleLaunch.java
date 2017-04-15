/*
Jemma Tiongson
Section #16031
App: ShuttleLaunch.java
Purpose: Demonstrate usage of thread and 'sleep' method.
-------------------------------------------------------------------------

Terminal:
   Compile: javac ShuttleLaunch.java
   Run: java ShuttleLaunch
_________________________________________________________________________
*/
class ShuttleLaunch{
   final static int SLEEP_TIME_MILLISECONDS = 1000;
   public static void main (String [] args){
      String count = "Hello!\nWelcome to the Shuttle Launch!\nT - 10\nT - 9 \nT - 8\nT - 7\nT - 6\nT - 5" +
            "\nT - 4\nT - 3\nT - 2\nIgnition...\nT - 1\nT - 0\nWe have a liftoff!";
      for(int i = 0; i < count.length(); i++){
         try{
            System.out.print(count.charAt(i));
            Thread.sleep(SLEEP_TIME_MILLISECONDS/10);
         }
         catch(InterruptedException e){
            System.out.println("IntereuptedException!");
         }
      }
   }
}
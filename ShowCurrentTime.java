/**
 * Developer: Nathan Kurz
 * 
 * Show the current time in Hour:minute:second format
 * Use UNIX epoch time (time elapsed since midnight, Jan 01, 1970 GMT) to determine
 * current time
 */

 public class ShowCurrentTime {
     public static void main(String[] args) {

         // Use System method currentTimeMillis to get current time elapsed
         long timeElapsed = System.currentTimeMillis();

         // obtain total seconds
         long totalSeconds = timeElapsed / 1000;

         // compute the current second with modulo
         long currentSecond = totalSeconds % 60;

         // obtain total minutes
         long totalMinutes = totalSeconds / 60;

         // compute current minute
         long currentMinute = totalMinutes % 60;

         // obtain total hours
         long totalHours = totalMinutes / 60;

         //compute current hour in day
         long currentHour = totalHours % 24;

         System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);


     }
 }
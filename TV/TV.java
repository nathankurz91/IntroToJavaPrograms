/**
 * Dev: Nathan Kurz
 * Date:04/22/2018
 * File: TV.java
 */

 public class TV {

     // Instance variables
     private int channel;
     private int volumeLevel;
     private boolean on;

     // Constructor
     public TV() {

     }

     public void turnOn() {
         this.on = true;
     }

     public void turnOff() {
         this.on = false;
     }

     public void setChannel(int channel) {
         this.channel = channel;
     }

     public void setVolume(int volumeLevel) {
         this.volumeLevel = volumeLevel;
     }

     public void channelUp() {
         this.channel++;
     }

     public void channelDown() {
         this.channel--;
     }

     public void volumeUp() {
         this.volumeLevel++;
     }

     public void volumeDown() {
         this.volumeLevel--;
     }

     public int getChannel() {
         return this.channel;
     }

     public int getVolume() {
         return this.volumeLevel;
     }

     public void checkPower() {
         if (this.on == true) {
             System.out.println("The TV is on.");
         } else {
             System.out.println("The TV is off.");
         }
     }

 }
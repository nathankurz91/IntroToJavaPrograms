/**
 * Dev: Nathan Kurz
 * Date: 04/22/2018
 * File: TestTV.java
 */

 public class TestTV {
     public static void main(String[] args) {

        // Create TV object
        TV sony = new TV();

        sony.turnOn();
        sony.setChannel(5);
        sony.setVolume(25);
        sony.channelDown();
        sony.channelDown();
        sony.volumeDown();
        sony.volumeDown();
        sony.checkPower();


        System.out.println("Current channel is: " + sony.getChannel());
        System.out.println("Current Volume is:" + sony.getVolume());

        sony.turnOff();
        sony.checkPower();
     }
 }
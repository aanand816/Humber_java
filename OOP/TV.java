package Aanand_n01712678.OOP;


public class TV {

    int channel;
    int volumeLevel;
    boolean on;

    public TV() {
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
        else{
            channel=1;
        }
    }

    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }else{
            channel=120;
        }
    }

    public void volumeUp() {
        if (on && volumeLevel < 1) {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }

    public static void main(String[] args) {
        TV tv = new TV();
        // Turns on the TV
        tv.turnOn();
        System.out.println("TV is on: " + tv.on);
        // Sets channel to 45
        tv.setChannel(120);
        System.out.println("Channel set to: " + tv.channel);
        // Sets volume to 5
        tv.setVolume(5);
        System.out.println("Volume set to: " + tv.volumeLevel);
        // Increases channel by 1
        tv.channelUp();
        System.out.println("Channel after increase: " + tv.channel);
        // Increases volume by 1
        tv.volumeUp();
        System.out.println("Volume after increase: " + tv.volumeLevel);
        // Decreases channel by 1
        tv.channelDown();
        System.out.println("Channel after decrease: " + tv.channel);
        // Decreases volume by 1
        tv.volumeDown();
        System.out.println("Volume after decrease: " + tv.volumeLevel);
        //turning off the TV
        tv.turnOff();
        System.out.println("TV is on: " + tv.on);
    }
}


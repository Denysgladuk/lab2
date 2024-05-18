package Facade;
public class Equalizer {
    public void setBassLevel(int level) {
        System.out.println("Setting bass level to " + level);
    }

    public void setTrebleLevel(int level) {
        System.out.println("Setting treble level to " + level);
    }

    public void reset() {
        System.out.println("Resetting equalizer settings");
    }
}
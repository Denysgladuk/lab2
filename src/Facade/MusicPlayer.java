package Facade;
public class MusicPlayer {
    public void loadFile(String filename) {
        System.out.println("Loading file: " + filename);
    }

    public void play() {
        System.out.println("Playing music");
    }

    public void stop() {
        System.out.println("Stopping music");
    }
}


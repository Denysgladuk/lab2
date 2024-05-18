package Comp;

public class Main {
    public static void main(String[] args) {

        Component song1 = new AudioFile("song1.mp3");
        Component song2 = new AudioFile("song2.mp3");
        Component song3 = new AudioFile("song3.mp3");


        Playlist playlist1 = new Playlist("Playlist 1");
        playlist1.addComponent(song1);
        playlist1.addComponent(song2);


        Playlist playlist2 = new Playlist("Playlist 2");
        playlist2.addComponent(song3);
        playlist2.addComponent(playlist1);


        playlist2.play();
    }
}


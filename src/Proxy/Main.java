package Proxy;
public class Main {
    public static void main(String[] args) {
        Music music = new ProxyMusic("song.mp3");

        music.play();

        System.out.println();

        music.play();
    }
}


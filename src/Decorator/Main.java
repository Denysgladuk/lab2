package Decorator;
public class Main {
    public static void main(String[] args) {
        Component song = new AudioFile("song.mp3");

        Component loggedSong = new LoggingDecorator(song);
        loggedSong.play();

        System.out.println();

        Component equalizedSong = new EqualizerDecorator(song);
        equalizedSong.play();

        System.out.println();

        Component visualizedSong = new VisualizationDecorator(song);
        visualizedSong.play();

        System.out.println();

        Component fullyDecoratedSong = new VisualizationDecorator(new EqualizerDecorator(new LoggingDecorator(song)));
        fullyDecoratedSong.play();
    }
}


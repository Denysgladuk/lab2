package Adapter;
public class Main {
    public static void main(String[] args) {

        OldAudioPlayer oldAudioPlayer = new OldAudioPlayerImpl();

        NewAudioPlayer newAudioPlayer = new NewAudioPlayerImpl();

        newAudioPlayer.playMP4("video.mp4");

        NewAudioPlayer adapter = new AudioPlayerAdapter(oldAudioPlayer);
        adapter.playMP4("music.mp3");
    }
}

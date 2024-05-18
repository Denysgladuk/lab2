package Bridge;

public class Main {
    public static void main(String[] args) {
        AudioFile mp3File = new MP3File();
        AudioFile mp4File = new MP4File();

        MusicPlayer advancedMusicPlayer1 = new AdvancedMusicPlayer(mp3File);
        MusicPlayer advancedMusicPlayer2 = new AdvancedMusicPlayer(mp4File);

        advancedMusicPlayer1.play("song.mp3");
        advancedMusicPlayer2.play("video.mp4");
    }
}


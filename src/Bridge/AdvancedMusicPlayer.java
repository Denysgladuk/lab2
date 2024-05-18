package Bridge;
public class AdvancedMusicPlayer extends MusicPlayer {

    public AdvancedMusicPlayer(AudioFile audioFile) {
        super(audioFile);
    }

    @Override
    public void play(String filename) {
        audioFile.playFile(filename);
    }
}


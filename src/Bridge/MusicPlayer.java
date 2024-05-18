package Bridge;

public abstract class MusicPlayer {
    protected AudioFile audioFile;

    protected MusicPlayer(AudioFile audioFile) {
        this.audioFile = audioFile;
    }

    public abstract void play(String filename);
}


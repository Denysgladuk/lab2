package Adapter;
public class AudioPlayerAdapter implements NewAudioPlayer {
    private OldAudioPlayer oldAudioPlayer;

    public AudioPlayerAdapter(OldAudioPlayer oldAudioPlayer) {
        this.oldAudioPlayer = oldAudioPlayer;
    }

    @Override
    public void playMP4(String filename) {
        // Перетворюємо виклик playMP4 на playMP3
        oldAudioPlayer.playMP3(filename);
    }
}


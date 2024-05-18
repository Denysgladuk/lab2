package Adapter;
public class OldAudioPlayerImpl implements OldAudioPlayer {
    @Override
    public void playMP3(String filename) {
        System.out.println("Playing MP3 file: " + filename);
    }
}
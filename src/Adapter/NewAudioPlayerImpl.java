package Adapter;
public class NewAudioPlayerImpl implements NewAudioPlayer {
    @Override
    public void playMP4(String filename) {
        System.out.println("Playing MP4 file: " + filename);
    }
}
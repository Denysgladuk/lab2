package Comp;
public class AudioFile implements Component {
    private String filename;

    public AudioFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void play() {
        System.out.println("Playing audio file: " + filename);
    }
}

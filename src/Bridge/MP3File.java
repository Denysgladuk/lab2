package Bridge;
public class MP3File implements AudioFile {
    @Override
    public void playFile(String filename) {
        System.out.println("Playing MP3 file: " + filename);
    }
}


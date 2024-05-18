package Bridge;
public class MP4File implements AudioFile {
    @Override
    public void playFile(String filename) {
        System.out.println("Playing MP4 file: " + filename);
    }
}

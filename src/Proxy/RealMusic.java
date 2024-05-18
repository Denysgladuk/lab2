package Proxy;
public class RealMusic implements Music {
    private String filename;

    public RealMusic(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename);
    }

    @Override
    public void play() {
        System.out.println("Playing " + filename);
    }
}

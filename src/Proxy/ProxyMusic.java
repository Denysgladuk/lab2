package Proxy;
public class ProxyMusic implements Music {
    private String filename;
    private RealMusic realMusic;

    public ProxyMusic(String filename) {
        this.filename = filename;
    }

    @Override
    public void play() {
        if (realMusic == null) {
            realMusic = new RealMusic(filename);
        }
        realMusic.play();
    }
}


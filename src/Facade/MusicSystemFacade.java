package Facade;
public class MusicSystemFacade {
    private MusicPlayer musicPlayer;
    private PlaylistManager playlistManager;
    private Equalizer equalizer;

    public MusicSystemFacade() {
        this.musicPlayer = new MusicPlayer();
        this.playlistManager = new PlaylistManager();
        this.equalizer = new Equalizer();
    }

    public void playMusic(String filename) {
        musicPlayer.loadFile(filename);
        musicPlayer.play();
    }

    public void stopMusic() {
        musicPlayer.stop();
    }

    public void addSongToPlaylist(String song) {
        playlistManager.addSong(song);
    }

    public void removeSongFromPlaylist(String song) {
        playlistManager.removeSong(song);
    }

    public void showPlaylist() {
        playlistManager.showPlaylist();
    }

    public void setBassLevel(int level) {
        equalizer.setBassLevel(level);
    }

    public void setTrebleLevel(int level) {
        equalizer.setTrebleLevel(level);
    }

    public void resetEqualizer() {
        equalizer.reset();
    }
}


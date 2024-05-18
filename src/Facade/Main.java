package Facade;
public class Main {
    public static void main(String[] args) {
        MusicSystemFacade musicSystem = new MusicSystemFacade();

        musicSystem.playMusic("song.mp3");
        musicSystem.setBassLevel(5);
        musicSystem.setTrebleLevel(7);
        musicSystem.stopMusic();

        System.out.println();

        musicSystem.addSongToPlaylist("song1.mp3");
        musicSystem.addSongToPlaylist("song2.mp3");
        musicSystem.showPlaylist();
        musicSystem.removeSongFromPlaylist("song1.mp3");
        musicSystem.showPlaylist();

        System.out.println();

        musicSystem.setBassLevel(10);
        musicSystem.resetEqualizer();
    }
}


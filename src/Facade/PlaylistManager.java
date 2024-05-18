package Facade;
import java.util.ArrayList;
import java.util.List;

public class PlaylistManager {
    private List<String> playlist = new ArrayList<>();

    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Added song: " + song);
    }

    public void removeSong(String song) {
        playlist.remove(song);
        System.out.println("Removed song: " + song);
    }

    public void showPlaylist() {
        System.out.println("Playlist: " + playlist);
    }
}


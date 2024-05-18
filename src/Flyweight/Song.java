package Flyweight;
import java.util.ArrayList;
import java.util.List;

public class Song {
    private List<Note> notes = new ArrayList<>();

    public void addNote(String symbol) {
        notes.add(NoteFactory.getNote(symbol));
    }

    public void play() {
        for (Note note : notes) {
            note.play();
        }
    }
}
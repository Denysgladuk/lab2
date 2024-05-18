package Flyweight;
import java.util.HashMap;
import java.util.Map;

public class NoteFactory {
    private static final Map<String, Note> notes = new HashMap<>();

    public static Note getNote(String symbol) {
        Note note = notes.get(symbol);
        if (note == null) {
            note = new ConcreteNote(symbol);
            notes.put(symbol, note);
        }
        return note;
    }

    public static int getNumberOfUniqueNotes() {
        return notes.size();
    }
}
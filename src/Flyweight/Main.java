package Flyweight;
public class Main {
    public static void main(String[] args) {
        Song song = new Song();
        song.addNote("C");
        song.addNote("D");
        song.addNote("E");
        song.addNote("F");
        song.addNote("G");
        song.addNote("A");
        song.addNote("B");
        song.addNote("C");

        song.play();

        System.out.println("Number of unique notes created: " + NoteFactory.getNumberOfUniqueNotes());
    }
}

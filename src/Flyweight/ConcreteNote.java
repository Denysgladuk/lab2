package Flyweight;
public class ConcreteNote implements Note {
    private String symbol;

    public ConcreteNote(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void play() {
        System.out.println("Playing note: " + symbol);
    }
}
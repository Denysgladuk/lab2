package Decorator;
public class VisualizationDecorator extends AudioFileDecorator {

    public VisualizationDecorator(Component decoratedAudioFile) {
        super(decoratedAudioFile);
    }

    @Override
    public void play() {
        System.out.println("Visualization: Showing visual effects");
        decoratedAudioFile.play();
    }
}
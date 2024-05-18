package Decorator;
public class EqualizerDecorator extends AudioFileDecorator {

    public EqualizerDecorator(Component decoratedAudioFile) {
        super(decoratedAudioFile);
    }

    @Override
    public void play() {
        System.out.println("Equalizer: Adjusting sound");
        decoratedAudioFile.play();
    }
}

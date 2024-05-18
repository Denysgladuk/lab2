package Decorator;
public abstract class AudioFileDecorator implements Component {
    protected Component decoratedAudioFile;

    public AudioFileDecorator(Component decoratedAudioFile) {
        this.decoratedAudioFile = decoratedAudioFile;
    }

    @Override
    public void play() {
        decoratedAudioFile.play();
    }
}

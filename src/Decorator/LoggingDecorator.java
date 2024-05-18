package Decorator;
public class LoggingDecorator extends AudioFileDecorator {

    public LoggingDecorator(Component decoratedAudioFile) {
        super(decoratedAudioFile);
    }

    @Override
    public void play() {
        System.out.println("Logging: Start playing");
        decoratedAudioFile.play();
        System.out.println("Logging: End playing");
    }
}

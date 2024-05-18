package Comp;
import java.util.ArrayList;
import java.util.List;

public class Playlist implements Component {
    private String name;
    private List<Component> components = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void play() {
        System.out.println("Playing playlist: " + name);
        for (Component component : components) {
            component.play();
        }
    }
}


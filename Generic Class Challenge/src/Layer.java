import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
    private List<T> elements = new ArrayList<>();

    public void addElements(T t) {
        elements.add(t);
    }

    public void renderLayer() {
        for (var i : elements) {
            System.out.print("Render ");
            i.render();
        }
    }
}

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Arbol {
    private int alto;
    private int horizontal;
    private String color;

    public Arbol(int alto, int horizontal, String color) {
        this.alto =alto;
        this.horizontal = horizontal;
        this.color = color;
    }
}

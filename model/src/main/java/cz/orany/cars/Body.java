package cz.orany.cars;

public class Body {

    private final Style style;
    private final int doors;

    public Body(Style style, int doors) {
        this.style = style;
        this.doors = doors;
    }

    public Style getStyle() {
        return style;
    }

    public int getDoors() {
        return doors;
    }

    public String getDescription() {
        return style.toString().toLowerCase() + " with " + doors + " doors";
    }
}

import java.util.Arrays;

abstract class Point implements Mappable {
    private double[] location;
    private final String type = "National Park";
    protected final String mapFigure = "Point";

    public Point(double[] location) {
        this.location = location;
    }

    protected String location() {
        return Arrays.toString(location);
    }

    public String getType() {
        return type;
    }
}

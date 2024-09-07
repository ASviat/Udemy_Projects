import java.util.Arrays;

abstract class Line implements Mappable {
    private double[][] locations;
    private final String type = "River";
    protected final String mapFigure = "Line";

    public Line(double[][] locations) {
        this.locations = locations;
    }

    protected String locations() {
        return Arrays.deepToString(locations);
    }

    public String getType() {
        return type;
    }
}


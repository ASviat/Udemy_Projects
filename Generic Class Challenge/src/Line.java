import java.util.Arrays;

abstract class Line implements Mappable {
    private double[][] locations;
    private final String type = "River";
    protected final String mapFigure = "Line";

    public Line(double[][] locations) {
        this.locations = locations;
    }

    protected String locations() {
        StringBuilder sb = new StringBuilder();
        for (var i : locations) {
            sb.append(Arrays.toString(i));
            sb.append(",");
        }
        String output = sb.toString();
        int stringLength = output.length();
        return output.substring(0, stringLength - 1);
    }

    public String getType() {
        return type;
    }
}


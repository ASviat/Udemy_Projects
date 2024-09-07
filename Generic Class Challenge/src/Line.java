import java.util.Arrays;

abstract class Line implements Mappable {
    private double[][] locations;
    private final String type = "River";
    protected final String mapFigure = "Line";

    public Line(double[][] locations) {
        this.locations = locations;
    }

//    protected String locations() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("[");
//        for (var i : locations) {
//            sb.append(Arrays.toString(i));
//            sb.append(",");
//        }
//
//        int stringLength = sb.length();
//        sb.deleteCharAt(stringLength - 1);
//        sb.append("]");
//        return sb.toString();


    protected String locations() {
        return Arrays.deepToString(locations);
    }

    public String getType() {
        return type;
    }
}


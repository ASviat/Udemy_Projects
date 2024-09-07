public class Main {
    public static void main(String[] args) {

        var park1 = new Park(new double[]{44.4882, -110.5916}, "Yellowstone");
        var park2 = new Park(new double[]{36.0636, -112.1079}, "Grand Canyon");

        var river1 = new River(new double[][]{{36.0636, -95.2348},
                {35.1556, -90.0659},
                {29.1566, -89.2495}}, "Mississippi");


        Layer<Mappable> elements = new Layer<>();

        elements.addElements(park1);
        elements.addElements(park2);
        elements.addElements(river1);

        elements.renderLayer();
    }
}

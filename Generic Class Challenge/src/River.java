public class River extends Line {

    private String name;

    public River(double[][] locations, String name) {
        super(locations);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println(name + " " + super.getType() + " as " + super.mapFigure + " (" + super.locations() + ")");
    }
}

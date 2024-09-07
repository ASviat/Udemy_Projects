public class Park extends Point {

    private String name;

    public Park(double[] location, String name) {
        super(location);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println(name + " " + super.getType() + " as " + super.mapFigure + super.location());
    }
}

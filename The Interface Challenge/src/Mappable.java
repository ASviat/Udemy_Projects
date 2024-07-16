public interface Mappable {

    public static final String JSON_PROPERTY = String.format("\"properties\": %s");

    void label();
//    One method should return a label (how the item will be described on the map).

    void geometryType();
//    One should return a geometry type (POINT or LINE) which is what the type will look like on the map.

    void iconType();
//    The last should return an icon type (sometimes called a map marker).

    default void toJSON() {
        label();
        geometryType();
        iconType();
//    Include a default method called toJSON() that prints out the type, label, and marker.  I'll show examples shortly.
    }

    static void printProperties(Mappable instance) {
        instance.iconType();
//    A static method, that takes a Mappable instance as an argument. This method should print out the properties
//    for each mappable type, including those mentioned above, but also any other fields on the business classes.
    }




}

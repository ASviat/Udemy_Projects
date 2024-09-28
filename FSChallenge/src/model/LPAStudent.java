package model;

public class LPAStudent extends Student {

    private double percentComplete;

    public LPAStudent() {
        super();
        percentComplete = random.nextDouble(0, 100.001);
    }

    public void setPercentComplete(double percentComplete) {
        this.percentComplete = percentComplete;
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }



    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch (fName) {
            case "NAME" -> super.getName().equalsIgnoreCase(value);
            case "COURSE" -> super.getCourse().equalsIgnoreCase(value);
            case "YEARSTARTED" -> super.getYearStarted() == (Integer.parseInt(value));
            case "PERCENTCOMPLETE" -> this.getPercentComplete() <= (Double.parseDouble(value));
            default -> false;
        };
    }
}


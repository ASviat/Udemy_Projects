package model;

import java.util.Comparator;

public class PercentageComparator implements Comparator<LPAStudent> {

    @Override
    public int compare(LPAStudent o1, LPAStudent o2) {
        return Double.compare(o1.getPercentComplete(), o2.getPercentComplete());
    }

}

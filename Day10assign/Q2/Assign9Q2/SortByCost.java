package Assign9Q2;
import java.util.*;
import Assign9Q2.*;

public class SortByCost implements Comparator<Project> {
    @Override
    public int compare(Project o1, Project o2) {
        int diff = (int) Double.compare(o1.getProjectCost(), o2.getProjectCost());
        return diff;
    }
}

package laba___1;

import java.util.Comparator;

import laba___1.Food;
import laba___1.Potatoes;

public class FoodComparator implements Comparator<Food> {

    @Override
    public int compare(Food o1, Food o2) {
        if (o1 instanceof Potatoes && o2 instanceof Potatoes) {
            Potatoes p1 = (Potatoes) o1;
            Potatoes p2 = (Potatoes) o2;
            return p1.getType().compareTo(p2.getType());
        }
        return 0;
    }
}
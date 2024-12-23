package laba___1;

import java.util.Arrays;
import java.util.Comparator;

public class MainApplication {

    public static void main(String[] args) throws Exception {

        Food[] breakfast = new Food[20];
        boolean calculateCalories = false;  
        boolean sortBreakfast = false;    
        int itemsSoFar = 0;

        for (String arg : args) {
            if (arg.equals("-calories")) {
                calculateCalories = true;
            } else if (arg.equals("-sort")) {
                sortBreakfast = true;
            } else {
                String[] parts = arg.split("/");
                if (parts[0].equals("Potatoes")) {
                    breakfast[itemsSoFar] = new Potatoes(parts[1]);
                    itemsSoFar++;
                }
            }
        }

        if (sortBreakfast) {
            Arrays.sort(breakfast, 0, itemsSoFar, new FoodComparator());
        }

        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
            } else {
                break;
            }
        }

        if (calculateCalories) {
            int totalCalories = 0;
            for (Food item : breakfast) {
                if (item != null && item instanceof Nutritious) {
                    totalCalories += ((Nutritious) item).calculateCalories();
                }
            }
            System.out.println("Общая калорийность завтрака: " + totalCalories + " калорий");
        }

        System.out.println("Всего хорошего!");
    }
}

package laba___1;

import java.util.HashMap;
import java.util.Map;

public class Potatoes extends Food {
	private String type;
	
	public static final Map<String, Integer> MAP_OF_CALORIES = new HashMap<>();
    static {
    	MAP_OF_CALORIES.put("fried", 150);
        MAP_OF_CALORIES.put("boiled", 100);
        MAP_OF_CALORIES.put("fries", 200);
    }

	public Potatoes(String name) {
		super("Картошка");
		this.type = name;
	}

	public void consume() {
		System.out.println(this + " съедено");
	}

	public String getType() {
		return type;
	}

	public void setType(String size) {
		this.type = size;
	}
	
	public String toString() {
		return super.toString() + " типа '" + type.toUpperCase() + " '";
 	}
	
	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
		if (!(arg0 instanceof Potatoes)) return false;
		return type.equals(((Potatoes)arg0).type);
		} else
		return false;
	}

	@Override
    public int calculateCalories() {
        return MAP_OF_CALORIES.getOrDefault(type.toLowerCase(), 10);
    }
	
}
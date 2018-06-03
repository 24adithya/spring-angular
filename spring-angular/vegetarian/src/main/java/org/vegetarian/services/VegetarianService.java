package org.vegetarian.services;

import java.util.List;

public interface VegetarianService {

	List<String> offerings();
	NutritionValue nutritionalValue();
	
	enum Offerings {
		CHEESESANDWICH,CHEESEDOSA;
	}
	
	enum NutritionValue {
		HIGH,MED,LOW;
	}
}


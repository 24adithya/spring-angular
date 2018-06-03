package org.vegan.services;

import java.util.List;

public interface VeganService {

	List<String> offerings();
	NutritionValue nutritionalValue();
	
	enum Offerings {
		HUMMUS,BABA_GHANOUSH,FALAFEL,SHAWARMA;
	}
	
	enum NutritionValue {
		HIGH,MED,LOW;
	}
}


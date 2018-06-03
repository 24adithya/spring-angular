package org.vegetarian.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.vegetarian.services.VegetarianService;

public class VegetarianServiceImpl implements VegetarianService {

	public List<String> offerings() {

		List<String> offerings = new ArrayList<>();
		offerings.add(VegetarianService.Offerings.CHEESEDOSA.toString());
		offerings.add(VegetarianService.Offerings.CHEESESANDWICH.toString());

		return offerings;
	}

	public NutritionValue nutritionalValue() {
		return VegetarianService.NutritionValue.MED;
	}
}

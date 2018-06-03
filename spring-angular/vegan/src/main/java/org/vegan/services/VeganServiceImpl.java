package org.vegan.services;

import java.util.ArrayList;
import java.util.List;

public class VeganServiceImpl implements VeganService {

	public List<String> offerings() {
		// Reflections reflections = new Reflections("org.vegan");
		// Set<Class<? extends Lebanese>> subTypes =
		// reflections.getSubTypesOf(Lebanese.class);
		// //Set<Class<?>> annotated =
		// reflections.getTypesAnnotatedWith(SomeAnnotation.class);

		List<String> offerings = new ArrayList<>();
		offerings.add(VeganService.Offerings.HUMMUS.toString());
		offerings.add(VeganService.Offerings.FALAFEL.toString());
		offerings.add(VeganService.Offerings.SHAWARMA.toString());

		return offerings;
	}

	public NutritionValue nutritionalValue() {
		return VeganService.NutritionValue.HIGH;
	}
}

package org.vegan.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class VeganServiceImpl implements VeganService {
    
    private static final Log LOG = LogFactory.getLog(VeganService.class);
    
    public VeganServiceImpl() {
        
    }

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

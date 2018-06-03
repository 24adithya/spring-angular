package org.vegan;

import org.vegan.services.VeganService;

public class Hummus extends Lebanese{

	@Override
	String name() {
		return "I am Hummus";//Remove hard coding and internationalize
	}

	@Override
	String offering() {
		return VeganService.Offerings.HUMMUS.toString();
	}

}

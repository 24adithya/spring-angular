package org.vegan;

import org.vegan.services.VeganService;

public class Falafel extends Lebanese{

	@Override
	String name() {
		return "I am Falafel";//Remove hard coding and internationalize
	}

	@Override
	String offering() {
		return VeganService.Offerings.FALAFEL.toString();
	}
}

package org.adams.food.config;

import java.util.ArrayList;
import java.util.List;

import org.adams.food.constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * System properties related to food
 * 
 * @author Adithya Narayan
 *
 */

public class FoodProperties {
	
	static final Logger logger = LogManager.getLogger(FoodProperties.class);

	private static boolean isVeganAvailable = false;
	private static boolean isVegetarianAvailable = false;
	
	static {
	    setAvailableFlags(); 
	}
	
	static FoodProperties foodProperties;

	public static String getAligneWebVersion() {
		return System.getProperty(Constants.FOOD_WEB_VERSION);
	}
	
	public static FoodProperties getAligneWebProperties() {
		if (foodProperties == null) {
			return new FoodProperties();
		} else
			return foodProperties;
	}

	public static void setAvailableFlags() {
	    setVeganAvailable(System.getProperty(Constants.VEGAN_AVAILABLE) == null ? false : isOptionAvailable(Constants.VEGAN_AVAILABLE));
	    setVegetarianAvailable(System.getProperty(Constants.VEGETARIAN_AVAILABLE) == null ? false : isOptionAvailable(Constants.VEGETARIAN_AVAILABLE));
	    logger.info("isVeganAvailable : " + isVeganAvailable());
	    logger.info("isVegetarianAvailable : " + isVegetarianAvailable());
	}
	
	private static boolean isOptionAvailable(String option) {
	    return System.getProperty(option).equals(String.valueOf(true)) ? true : false;
	}

	public static boolean isVeganAvailable() {
        return isVeganAvailable;
    }

    private static void setVeganAvailable(boolean isVeganAvailable) {
        FoodProperties.isVeganAvailable = isVeganAvailable;
    }

    public static boolean isVegetarianAvailable() {
        return isVegetarianAvailable;
    }

    private static void setVegetarianAvailable(boolean isVegetarianAvailable) {
        FoodProperties.isVegetarianAvailable = isVegetarianAvailable;
    }

	public static List<String> getServerModulesList() {
		List<String> modules = new ArrayList<String>();

		if (FoodProperties.isVeganAvailable()) {
		    modules.add(Constants.getVeganModule());
		}

		if (FoodProperties.isVegetarianAvailable()) {
            modules.add(Constants.getVegetarianModule());
        }

		return modules;
	}
	
//	public static boolean isConfigApp() {
//		return System.getProperty(ConfigConstants.IS_CONFIG_APP) != null && System.getProperty(ConfigConstants.IS_CONFIG_APP).equalsIgnoreCase("Y"); 
//	}
}

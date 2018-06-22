package org.adams.food.constants;

public class Constants {

    private Constants() {
        
    }
    public static final String FOOD_WEB_VERSION = "FOOD_WEB_VERSION";
    public static final String VEGAN_AVAILABLE = "VEGAN_AVAILABLE";
    public static final String VEGETARIAN_AVAILABLE = "VEGETARIAN_AVAILABLE";
    
    public static String getVegetarianModule() {
        return MODULES.VEGETARIAN.toString();
    }
    
    public static String getVeganModule() {
        return MODULES.VEGAN.toString();
    }
    
    private enum MODULES {
        VEGAN, VEGETARIAN;
    }
}

package org.adams.food.config;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Conditional(VeganConfigCondition.class)
@ImportResource(value = { "classpath:vegan-config.xml" })
public class VeganConfigLoader {
}

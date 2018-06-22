package org.adams.food.config;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class VeganConfigCondition implements ConfigurationCondition {

	public ConfigurationPhase getConfigurationPhase() {
		return ConfigurationPhase.PARSE_CONFIGURATION;
	}

	public boolean matches(	ConditionContext context,
							AnnotatedTypeMetadata metadata) {
		boolean installed = FoodProperties.isGboInstalled();
		return installed;
	}
}

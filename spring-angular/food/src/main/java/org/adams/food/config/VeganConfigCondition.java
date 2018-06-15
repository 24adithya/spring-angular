package org.adams.food.config;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class VeganConfigCondition implements ConfigurationCondition {

	@Override
	public ConfigurationPhase getConfigurationPhase() {
		return ConfigurationPhase.PARSE_CONFIGURATION;
	}

	@Override
	public boolean matches(	ConditionContext context,
							AnnotatedTypeMetadata metadata) {
		boolean installed = AligneWebProperties.isGboInstalled();
		return installed;
	}
}

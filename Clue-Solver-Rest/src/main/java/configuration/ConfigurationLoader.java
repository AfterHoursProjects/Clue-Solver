package configuration;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.DefaultConfigurationBuilder;

import com.google.common.base.Throwables;

public final class ConfigurationLoader {
	public static final String CONFIGURATION_PATH = "configuration.xml";
	private static final Configuration config;

	static {
		try {
			config = new DefaultConfigurationBuilder(CONFIGURATION_PATH).getConfiguration(true);
		} catch (final Exception e) {
			throw Throwables.propagate(e);
		}
	}

	public static Configuration getConfiguration() {
		return config;
	}

	private ConfigurationLoader() {

	}
}

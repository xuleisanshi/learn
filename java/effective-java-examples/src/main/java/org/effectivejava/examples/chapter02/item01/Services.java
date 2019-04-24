// Service provider framework sketch

// Noninstantiable class for service registration and access - Pages 8-9
package org.effectivejava.examples.chapter02.item01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
	private Services() {
		//constructor
	} // Prevents instantiation (Item 4)

	// Maps service names to services
	private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();
	public static final String DEFAULT_PROVIDER_NAME = "<def>";

	// Provider registration API
	public static void registerDefaultProvider(Provider provider) {
		registerProvider(DEFAULT_PROVIDER_NAME, provider);
	}
// registration api not default
	public static void registerProvider(String name, Provider provider) {
		providers.put(name, provider);
	}

	// Service access API
	public static Service newInstance() {
		return newInstance(DEFAULT_PROVIDER_NAME);
	}

	public static Service newInstance(String name) {
		Provider provider = providers.get(name);
		if (provider == null){
			throw new IllegalArgumentException(
					"No provider registered with name: " + name);}
		return provider.newService();
	}
}

package io.nirahtech.ride4ever.application.infrastructure;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.List;

public class PluginClassLoader extends URLClassLoader {

	public static final List<String> SHARED_PACKAGES = Arrays.asList("io.nirahtech.ride4ever.core.infrastructure.plugin.api");

	private final ClassLoader parentClassLoader;

	public PluginClassLoader(URL[] urls, ClassLoader parentClassLoader) {
		super(urls, null);
		this.parentClassLoader = parentClassLoader;
	}

	@Override
	protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
		// has the class loaded already?
		Class<?> loadedClass = findLoadedClass(name);
		if (loadedClass == null) {
			final boolean isSharedClass = SHARED_PACKAGES.stream().anyMatch(name::startsWith);
			if (isSharedClass) {
				loadedClass = parentClassLoader.loadClass(name);
			} else {
				loadedClass = super.loadClass(name, resolve);
			}
		}

		if (resolve) { // marked to resolve
			resolveClass(loadedClass);
		}
		return loadedClass;
	}
}

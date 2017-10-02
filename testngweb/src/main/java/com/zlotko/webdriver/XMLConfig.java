package com.zlotko.webdriver;

import lombok.RequiredArgsConstructor;
import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
public class XMLConfig {

	private final Map<String, String> parameters;

	public String getParameter(final String key) {
		return parameters.getOrDefault(key, "");
	}

	public String getBrowser() {
		return Optional.ofNullable(getParameter("browser"))
				.orElse("firefox");
	}
}

package com.example.cucumber;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * Point d'entrée Cucumber : lance tous les fichiers .feature du dossier
 * src/test/resources/features avec les steps du package com.example.cucumber.
 * Rapport HTML généré dans target/cucumber-report.html.
 */
@Suite(failIfNoTests = false) // pas d'erreur tant qu'aucun .feature n'existe
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty,html:target/cucumber-report.html")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example.cucumber")
public class CucumberTestRunner {
}

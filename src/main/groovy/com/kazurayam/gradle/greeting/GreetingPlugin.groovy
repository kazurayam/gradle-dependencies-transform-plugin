package com.kazurayam.gradle.greeting


import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * https://www.baeldung.com/gradle-create-plugin
 */
class GreetingPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        GreetingPluginExtension extension =
                project.getExtensions().create("greeting", GreetingPluginExtension.class)

        project.task("hello") {
            doLast { task ->
                println "Hello, ${extension.getGreeter()}"
                println "I have a message for You: ${extension.getMessage()}"
            }
        }
    }
}

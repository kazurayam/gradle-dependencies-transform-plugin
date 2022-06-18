package com.kazurayam.gradle.hello


import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create("hello", HelloExtension)
        project.tasks.create('hello') {
            doLast {
                println("Hello, ${project.extensions.getByType(HelloExtension.class).message}")
            }
        }
    }
}
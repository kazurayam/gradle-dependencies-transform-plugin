package com.kazurayam.gradle.hello


import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create("greeting", HelloExtension)
        project.tasks.create('greeting') {
            doLast {
                println("Hello, ${project.extensions.getByType(HelloExtension.class).message}")
            }
        }
        new HowareyouPlugin().apply(project)
    }
}
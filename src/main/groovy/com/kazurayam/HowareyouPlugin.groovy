package com.kazurayam

import org.gradle.api.Plugin
import org.gradle.api.Project

class HowareyouPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.tasks.create('howareyou') {
            doLast {
                println("How are you?");
            }
        }
    }
}

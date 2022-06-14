package com.kazurayam.gradle.subprojectdistribution

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 *
 */
class SubprojectDistribution implements Plugin<Project> {

    @Override
    void apply(Project project) {
        //return ancestorProjectsName(project.rootProject, project, '')
    }

    /* resolves `archiveBaseName` of Zip task for a sub-project */
    String ancestorProjectsName(Project rootProject, Project proj, String str = '') {
        String s = str;
        if (proj.name == rootProject.name) {
            s = rootProject.name
        } else {
            s = ancestorProjectsName(rootProject, proj.parent) +
                    '-' + proj.name
        }
        return s
    }
}

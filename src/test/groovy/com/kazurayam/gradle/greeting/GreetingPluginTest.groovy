package com.kazurayam.gradle.greeting

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertEquals
import static org.junit.jupiter.api.Assertions.assertTrue
import static org.junit.jupiter.api.Assertions.assertNotNull

class GreetingPluginTest {

    @Test
    void test_apply() {
        Project project = ProjectBuilder.builder().build()
        String id = "com.kazurayam.gradle.greeting"
        project.getPluginManager().apply(id)
        assertTrue(project.getPluginManager().hasPlugin(id),
                "project has no ${id} plugin")
        assertNotNull(project.getTasks().getByName("hello"))
    }
}

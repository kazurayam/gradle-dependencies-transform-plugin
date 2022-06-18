package com.kazurayam

import org.gradle.testkit.runner.GradleRunner
import spock.lang.Specification
import spock.lang.TempDir

import static org.gradle.testkit.runner.TaskOutcome.SUCCESS

class HelloPluginFunctionalTest extends Specification {

    @TempDir File testProjectDir
    File buildFile

    def setup() {
        buildFile = new File(testProjectDir, 'build.gradle')
        buildFile << """
            plugins {
                id 'com.kazurayam.hello'
            }
        """
    }

    def "can successfully greet the world"() {
        buildFile << """
            hello {
                message = 'world'
            }
        """

        when:
        def result =
                GradleRunner.create()
                        .withProjectDir(testProjectDir)
                        .withArguments('hello')
                        .withPluginClasspath()
                        .build()
        then:
        result.output.contains("Hello, world")
        result.task(":hello").outcome == SUCCESS
    }
}

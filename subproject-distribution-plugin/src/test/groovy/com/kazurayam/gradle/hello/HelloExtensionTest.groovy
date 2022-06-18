package com.kazurayam.gradle.hello

import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals

class HelloExtensionTest {

    @Test
    void test_message() {
        HelloExtension helloExtension = new HelloExtension()
        helloExtension.message = "world"
        assertEquals("world", helloExtension.message)
    }
}

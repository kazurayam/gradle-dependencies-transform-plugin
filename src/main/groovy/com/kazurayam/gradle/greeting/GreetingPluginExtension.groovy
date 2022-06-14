package com.kazurayam.gradle.greeting

class GreetingPluginExtension {
    String greeter = "Baeldung"
    String message = "Message from the plugin!"
    String getGreeter() {
        return greeter
    }
    String getMessage() {
        return message
    }
}

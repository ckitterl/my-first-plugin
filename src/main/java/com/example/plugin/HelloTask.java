package com.example.plugin;

import org.gradle.api.DefaultTask;

public class HelloTask extends DefaultTask {

    public void run() {
        System.out.println("Hello from task " + getPath() + "!");
    }
}

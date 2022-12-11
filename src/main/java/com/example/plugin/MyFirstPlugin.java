package com.example.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class MyFirstPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("Hello from the GreetingPlugin");
        project.getTasks().create("hello", HelloTask.class);
    }
}

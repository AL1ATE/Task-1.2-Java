package ru.vsu.cs.obukhov;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private Map<String, Boolean> tasks;

    public Student(String name) {
        this.name = name;
        tasks = new HashMap<>();
    }

    public void addTask(String taskName, boolean isCompleted) {
        tasks.put(taskName, isCompleted);
    }

    public boolean hasTask(String taskName) {
        return tasks.containsKey(taskName);
    }

    public boolean isTaskCompleted(String taskName) {
        if (hasTask(taskName)) {
            return tasks.get(taskName);
        }
        return false;
    }

    public void removeTask(String taskName) {
        tasks.remove(taskName);
    }

    public String getName() {
        return name;
    }

    public Map<String, Boolean> getTasks() {
        return tasks;
    }
}


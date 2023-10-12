package ru.vsu.cs.obukhov;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group("Группа 1");
        Group group2 = new Group("Группа 2");

        Student student1 = new Student("Иван");
        Student student2 = new Student("Мария");
        Student student3 = new Student("Петр");

        group1.addStudent(student1);
        group1.addStudent(student2);
        group2.addStudent(student3);

        student1.addTask("Задача 1", true);
        student1.addTask("Задача 2", false);
        student2.addTask("Задача 1", true);
        student2.addTask("Задача 2", true);
        student3.addTask("Задача 1", false);

        System.out.println("Информация о студентах:");
        for (Group group : List.of(group1, group2)) {
            System.out.println("Группа: " + group.getName());
            for (Student student : group.getStudents()) {
                System.out.println("Студент: " + student.getName());
                for (Map.Entry<String, Boolean> taskEntry : student.getTasks().entrySet()) {
                    String taskName = taskEntry.getKey();
                    boolean isCompleted = taskEntry.getValue();
                    System.out.println("Задача: " + taskName + ", Сдана: " + isCompleted);
                }
                System.out.println();
            }
        }

        group1.removeStudent(student2);
        student1.removeTask("Задача 1");

        System.out.println("\nОбновленная информация о студентах после удалений:");
        for (Group group : List.of(group1, group2)) {
            System.out.println("Группа: " + group.getName());
            for (Student student : group.getStudents()) {
                System.out.println("Студент: " + student.getName());
                for (Map.Entry<String, Boolean> taskEntry : student.getTasks().entrySet()) {
                    String taskName = taskEntry.getKey();
                    boolean isCompleted = taskEntry.getValue();
                    System.out.println("Задача: " + taskName + ", Сдана: " + isCompleted);
                }
                System.out.println();
            }
        }
    }
}


package org.example;

import org.example.controller.Controller;
import org.example.controller.StudyGroupController;
import org.example.controller.TeacherController;
import org.example.model.Student;
import org.example.model.StudyGroup;
import org.example.model.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    
        Teacher teacher = new Teacher("Mazin", "Lazar", "Saulovich", 1);
     List<Student> students = List.of(new Student("Ivanov", "Ivan", "Ivanovich", 2), new Student("Petrov", "Petr", "Petrovich", 3), new Student("Sidorov", "Fedor", "Sergeevich", 4));

      StudyGroupController studyGroupController = new StudyGroupController();


        StudyGroup studyGroup = studyGroupController.createStudyGroupWithTeacherAndStudents(teacher, students);

       System.out.println(studyGroup.getTeacher().toString());
        for (Student student : studyGroup.getStudents()){
            System.out.println(student.toString());
        }
    }
}
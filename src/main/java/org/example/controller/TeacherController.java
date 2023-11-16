package org.example.controller;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.Type;
import org.example.model.User;
import org.example.service.DataService;
import org.example.view.StudentView;
import org.example.view.TeacherView;

import java.util.List;

public class TeacherController {
    private final DataService service = new DataService();
    private final TeacherView teacherView = new TeacherView();



    public void crateTeacher(String firstName, String secondName, String lastName){
        service.create(firstName, secondName, lastName, Type.TEACHER);
    }
    public void getAllTeacher(){
        List<User> userList = service.getUserList();
        for (User user : userList){
            teacherView.printOnConsole((Teacher) user);
        }
    }
}

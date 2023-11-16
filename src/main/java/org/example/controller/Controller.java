package org.example.controller;

import org.example.model.*;
import org.example.service.DataService;
import org.example.service.StudyGroupService;
import org.example.view.StudentView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();



    public void crateStudent(String firstName, String secondName, String lastName){
        service.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public void getAllStudent(){
        List<User> userList = service.getUserList();
        for (User user : userList){
            studentView.printOnConsole((Student) user);
        }
    }
}

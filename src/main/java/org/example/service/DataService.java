package org.example.service;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.Type;
import org.example.model.User;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList = new ArrayList<>();
    public void create(String firstName, String secondName, String lastName, Type type){
        int id = getFreeId(type);
        if (type == Type.STUDENT){
            Student student = new Student(firstName, secondName, lastName, id);
            userList.add(student);
        }else if (type == Type.TEACHER){
            Teacher teacher = new Teacher(firstName, secondName, lastName, id);
            userList.add(teacher);
        }
    }
    private int getFreeId(Type type){
        boolean itsStudent = type == Type.STUDENT;
        for (int i = userList.size() - 1; i>= 0; i--){
            User user = userList.get(i);
            if (user instanceof Student && itsStudent)
                return ((Student) user).getStudentId()+1;
            else if (user instanceof Teacher && !itsStudent)
                return ((Teacher) user).getTeacherId()+1;
        }
        return 0;
    }

    public List<User> getUserList() {
        return userList;
    }
}

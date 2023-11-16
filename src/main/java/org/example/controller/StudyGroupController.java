package org.example.controller;

import org.example.model.Student;
import org.example.model.StudyGroup;
import org.example.model.Teacher;
import org.example.model.User;
import org.example.service.DataService;
import org.example.service.StudyGroupService;
import org.example.view.StudentView;
import org.example.view.TeacherView;

import java.util.List;

public class StudyGroupController {
    private final DataService service = new DataService();

    private StudyGroupService studyGroupService;

    public StudyGroupController() {
        this.studyGroupService = new StudyGroupService();
    }
    public StudyGroup createStudyGroupWithTeacherAndStudents(Teacher teacher, List<Student> students){
        return studyGroupService.createStudyGroup(teacher, students);
    }

    public StudyGroupService getStudyGroupService() {
        return studyGroupService;
    }

}

package Lab3.main.client.presentation.view_model;

import Lab3.main.client.model.Student;
import Lab3.main.client.service.StudentService;

import java.util.List;

public abstract class PresentationModel {
    protected StudentService studentService;
    public PresentationModel(StudentService studentService) {
        this.studentService = studentService;
    }

    public abstract List<Student> getItems();
}

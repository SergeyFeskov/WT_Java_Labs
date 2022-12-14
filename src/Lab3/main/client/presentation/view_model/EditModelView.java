package Lab3.main.client.presentation.view_model;

import Lab3.main.client.model.Student;
import Lab3.main.client.service.StudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EditModelView extends PresentationModel {
    private final int id;

    public EditModelView(StudentService studentService, int id) {
        super(studentService);
        this.id = id;
    }

    @Override
    public List<Student> getItems() {
        Student result = this.studentService.get(this.id);
        return result == null ? new ArrayList<>()
                : Collections.singletonList(result);
    }
}

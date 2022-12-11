package Lab3.main.client.presentation.view;

import Lab3.main.client.model.User;
import Lab3.main.client.presentation.view_model.PresentationModel;
import Lab3.main.client.service.StudentService;

public abstract class PresentationView {
    protected PresentationModel model;
    protected StudentService studentService;
    protected User currentUser;

    protected PresentationView(StudentService studentService, User user) {
        this.studentService = studentService;
        this.currentUser = user;
    }

    public abstract void show();
    public abstract PresentationView getInput(String input);
}

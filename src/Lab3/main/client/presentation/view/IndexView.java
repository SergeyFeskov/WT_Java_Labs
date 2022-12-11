package Lab3.main.client.presentation.view;

import Lab3.main.client.model.User;
import Lab3.main.client.service.StudentService;

public class IndexView extends PresentationView {
    public IndexView(StudentService studentService, User user) {
        super(studentService, user);
    }

    @Override
    public void show() {
        System.out.println("1: Get\n2: exit");
    }

    @Override
    public PresentationView getInput(String input) {
        return switch (input) {
            case "1" -> new GetSelectView(this.studentService, this.currentUser);
            case "2" -> null;
            default -> throw new IllegalArgumentException();
        };
    }
}

package Lab3.main.client.presentation.view;

import Lab3.main.client.model.User;
import Lab3.main.client.service.StudentService;

public class GuestView extends PresentationView{

    public GuestView(StudentService studentService, User user) {
        super(studentService, user);
    }

    @Override
    public void show() {
        System.out.println("1: Register\n2: Login\n3: exit");
    }

    @Override
    public PresentationView getInput(String input) {
        return switch (input) {
            case "1" -> new RegisterView(this.studentService, this.currentUser);
            case "2" -> new LoginView(this.studentService, this.currentUser);
            case "3" -> null;
            default -> throw new IllegalArgumentException();
        };
    }
}

package Lab3.main.client.presentation.view;

import Lab3.main.client.model.Role;
import Lab3.main.client.model.User;
import Lab3.main.client.presentation.view.input.SetInputUser;
import Lab3.main.client.service.StudentService;
import org.javatuples.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RegisterView extends PresentationView{
    private final List<Pair<String, SetInputUser>> inputs = Arrays.asList(
            new Pair<String, SetInputUser>("Login:", (user, input) -> {
                user.setLogin(input);
                return true;
            }),
            new Pair<String, SetInputUser>("Password:", (user, input) -> {
                user.setPassword(input);
                return true;
            }),
            new Pair<String, SetInputUser>("Choose role(1: Admin 2: User quit: Exit)", (user, input) -> {
                if (input.equals("1")) {
                    user.setRole(Role.ADMIN);
                    return true;
                } else if (input.equals("2")) {
                    user.setRole(Role.USER);
                    return true;
                }

                return false;
            })
    );

    public RegisterView(StudentService studentService, User user) {
        super(studentService, user);
    }

    @Override
    public void show() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        int i = 0;
        String input;
        System.out.println("Enter 'quit' to exit.");
        while (i < inputs.size()) {
            System.out.println(inputs.get(i).getValue0());
            input = scanner.nextLine();
            if (input.equals("quit")) {
                scanner.close();
                return;
            }

            if (inputs.get(i).getValue1().setInput(user, input)) {
                i++;
            } else {
                System.out.println("Invalid input!");
            }
        }
        scanner.close();

        User auth = this.studentService.register(user);
        if (auth == null) {
            System.out.println("User exists.");
        } else {
            this.currentUser = auth;
        }
    }

    @Override
    public PresentationView getInput(String input) {
        return switch (this.currentUser.getRole()) {
            case USER -> new IndexView(this.studentService, this.currentUser);
            case ADMIN -> new AdminView(this.studentService, this.currentUser);
            case GUEST -> new GuestView(this.studentService, this.currentUser);
        };
    }
}

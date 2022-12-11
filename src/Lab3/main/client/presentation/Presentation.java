package Lab3.main.client.presentation;

import Lab3.main.client.model.Role;
import Lab3.main.client.model.User;
import Lab3.main.client.presentation.view.GuestView;
import Lab3.main.client.presentation.view.PresentationView;
import Lab3.main.client.service.StudentService;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Presentation {
    private PresentationView view;
    private User currentUser = null;
    public Presentation(StudentService studentService) {
        this.currentUser = new User();
        this.currentUser.setRole(Role.GUEST);
        this.view = new GuestView(studentService, this.currentUser);
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);
        while (this.view != null) {
            this.view.show();
            while (!tryInput(scanner)) {
                System.out.println("Invalid input");
            }
        }
        scanner.close();
    }

    private boolean tryInput(Scanner scanner) {
        try {
            return getInput(scanner.nextLine());
        } catch (NoSuchElementException ex) {
            return getInput("");
        }
    }

    private boolean getInput(String input) {
        try {
            this.view = this.view.getInput(input);
            return true;
        } catch (IllegalArgumentException ex) {
            return false;
        }
    }
}

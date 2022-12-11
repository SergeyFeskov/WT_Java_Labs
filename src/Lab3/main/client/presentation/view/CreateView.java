package Lab3.main.client.presentation.view;

import Lab3.main.client.model.Student;
import Lab3.main.client.model.User;
import Lab3.main.client.presentation.view.input.SetInputStudent;
import Lab3.main.client.service.StudentService;
import org.javatuples.Pair;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CreateView extends PresentationView {    
    private final List<Pair<String, SetInputStudent>> inputs = Arrays.asList(
            new Pair<String, SetInputStudent>("Print name:", (student, input) -> {
                student.setName(input);
                return true;
            }),
            new Pair<String, SetInputStudent>("Birthday(dd/MM/yyyy):", (student, input) -> {
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                try {
                    student.setBirthday(LocalDate.parse(input, dateTimeFormatter));
                    return true;
                } catch (DateTimeParseException ex) {
                    System.out.println("Invalid format");
                }

                return false;
            }),
            new Pair<String, SetInputStudent>("Characteristic:", (student, input) -> {
                student.setCharacteristic(input);
                return true;
            })
    );

    public CreateView(StudentService studentService, User user) {
        super(studentService, user);        
    }

    @Override
    public void show() {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

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

            if (inputs.get(i).getValue1().setInput(student, input)) {
                i++;
            } else {
                System.out.println("Invalid input!");
            }
        }
        scanner.close();

        student.setLastModification(LocalDateTime.now());
        if (!this.studentService.create(student)) {
            System.out.println("Error creating");
        }        
    }

    @Override
    public PresentationView getInput(String input) {
        return new AdminView(this.studentService, this.currentUser);
    }
}

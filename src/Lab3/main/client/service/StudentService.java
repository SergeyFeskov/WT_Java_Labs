package Lab3.main.client.service;

import Lab3.main.client.dao.StudentDAO;
import Lab3.main.client.model.Student;
import Lab3.main.client.model.User;

import java.util.List;

public class StudentService {
    private final StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public boolean edit(Student newValue) {
        return this.studentDAO.edit(newValue);
    }

    public List<Student> getAll() {
        return this.studentDAO.getAll();
    }

    public Student get(int id) {
        return this.studentDAO.get(id);
    }

    public boolean create(Student student) {
        return this.studentDAO.create(student);
    }

    public User register(User user) {
        return this.studentDAO.register(user);
    }

    public User login(User user) {
        return this.studentDAO.login(user);
    }
}

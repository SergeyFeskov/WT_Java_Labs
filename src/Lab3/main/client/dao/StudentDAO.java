package Lab3.main.client.dao;

import Lab3.main.client.dto.StudentResponseDTO;
import Lab3.main.client.model.Request;
import Lab3.main.client.model.Response;
import Lab3.main.client.model.Student;
import Lab3.main.client.model.User;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private final SocketManager socketManager = new SocketManager("localhost", 5556);

    public boolean edit(Student newValue) {
        StudentResponseDTO response = socketManager
                .sendRequest(newValue, Request.EDIT);
        return (response != null)
                && (response.getResponse() == Response.OK);
    }

    public List<Student> getAll() {
        StudentResponseDTO response = socketManager
                .sendRequest(null, Request.GET_ALL);

        if ((response != null)
                && (response.getResponse() == Response.OK)
                && (response.getBody() instanceof ArrayList<?>)) {
            try {
                return (ArrayList<Student>)response.getBody();
            } catch (ClassCastException e) {
                return new ArrayList<>();
            }
        }

        return new ArrayList<>();
    }

    public Student get(int id) {
        StudentResponseDTO response = socketManager
                .sendRequest(id, Request.GET);

        Object body = response.getBody();
        if ((response != null)
                && (response.getResponse() == Response.OK)
                && (Student.class.isInstance(body))) {
            return (Student)body;
        }

        return null;
    }

    public boolean create(Student item) {
        StudentResponseDTO response = socketManager
                .sendRequest(item, Request.CREATE);
        return (response != null)
                && (response.getResponse() == Response.OK);
    }

    public User register(User user) {
        StudentResponseDTO response = socketManager
                .sendRequest(user, Request.REGISTER);
        Object body = response.getBody();
        if (User.class.isInstance(body)) {
            return (User)body;
        }

        return null;
    }

    public User login(User user) {
        StudentResponseDTO response = socketManager
                .sendRequest(user, Request.LOGIN);
        Object body = response.getBody();
        if (User.class.isInstance(body)) {
            return (User)body;
        }

        return null;
    }
}

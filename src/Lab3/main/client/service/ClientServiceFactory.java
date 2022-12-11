package Lab3.main.client.service;

import Lab3.main.client.dao.StudentDAO;

public class ClientServiceFactory {
    private static final ClientServiceFactory instance = new ClientServiceFactory();

    private ClientServiceFactory() {}

    public StudentService getStudentService(StudentDAO studentDAO) {

        return new StudentService(studentDAO);
    }

    public static ClientServiceFactory getInstance() {
        return instance;
    }
}

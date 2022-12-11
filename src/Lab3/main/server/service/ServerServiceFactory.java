package Lab3.main.server.service;

import Lab3.main.server.dao.StudentDAO;

public class ServerServiceFactory {
    private static final ServerServiceFactory instance = new ServerServiceFactory();

    private ServerServiceFactory() {}

    public StudentService getStudentService(StudentDAO studentDAO) {
        return new StudentService(studentDAO);
    }

    public static ServerServiceFactory getInstance() {
        return instance;
    }
}

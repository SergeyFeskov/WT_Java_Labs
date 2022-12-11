package Lab3.main.client;

import Lab3.main.client.dao.ClientDAOFactory;
import Lab3.main.client.presentation.Presentation;
import Lab3.main.client.service.ClientServiceFactory;

public class ClientApp {
    public static void main(String[] args) {
        ClientServiceFactory factory = ClientServiceFactory.getInstance();
        ClientDAOFactory daoFactory = ClientDAOFactory.getInstance();
        Presentation presentation = new Presentation(factory.getStudentService(daoFactory.getStudentDAO()));
        presentation.show();
    }
}

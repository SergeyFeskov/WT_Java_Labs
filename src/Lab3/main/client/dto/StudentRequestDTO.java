package Lab3.main.client.dto;

import Lab3.main.client.model.Request;

import java.io.Serializable;

public class StudentRequestDTO implements Serializable {
    private Lab3.main.client.model.Request Request;
    private Object body;

    public Request getRequest() {
        return Request;
    }

    public void setRequest(Request Request) {
        this.Request = Request;
    }

    public Object getBody() {
        return this.body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}

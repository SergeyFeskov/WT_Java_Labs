package Lab3.main.client.dto;

import Lab3.main.client.model.Response;

import java.io.Serializable;

public class StudentResponseDTO implements Serializable {
    private Response Response;
    private Object body;

    public Lab3.main.client.model.Response getResponse() {
        return Response;
    }

    public void setResponse(Response Response) {
        this.Response = Response;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}

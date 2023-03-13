package model;

import java.util.Date;

public class Note {
    private String id = "";
    private String heading;
    private String body;
    private Date dateOfCreate = new Date();

    public Note(String heading, String body) {
        this.heading = heading;
        this.body = body;
    }
    public Note(String id, String heading, String body) {
        this(heading, body);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getHeading() {
        return heading;
    }

    public String getBody() {
        return body;
    }

    public Date getDateOfCreate() {
        return dateOfCreate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setBody(String body) {
        this.body = body;
    }


    @Override
    public String toString() {
        return String.format("Номер заметки: %s\nЗаголовок: %s,\nТекст: %s,\nДата: %s",id,heading,body,dateOfCreate);
    }
}


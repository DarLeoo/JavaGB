package model;

import java.util.List;

public interface Repository {
    List<Note> getAllNotes();

    String CreateNote(Note user);

    void saveNote(List<Note> users);

    Note deleteNote(String id);
}

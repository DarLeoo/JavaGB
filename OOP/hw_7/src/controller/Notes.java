package controller;

import model.Note;
import java.util.List;

public interface Notes {
    void saveNote(Note note) throws Exception;
    Note readNote(String noteId) throws Exception;
    Note noteSearch(String noteId, List<Note> notes) throws Exception;
    List<Note> readAllUsers();
    void updateNote(String noteId, Note newNote) throws Exception;
    void deleteNote(String noteID) throws Exception;

}

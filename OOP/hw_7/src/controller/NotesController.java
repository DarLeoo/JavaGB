package controller;

import java.util.List;
import model.Repository;
import model.Note;

public class NotesController {
    private final Repository repository;


    public NotesController(Repository repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) throws Exception {
        repository.CreateNote(note);
    }

    public Note readNote(String noteId) throws Exception {
        List<Note> notes = repository.getAllNotes();
        Note note = noteSearch(noteId, notes);
        return note;
    }

    private static Note noteSearch(String userId, List<Note> notes) throws Exception{
        for (Note item : notes) {
            if (item.getId().equals(userId)) {
                return item;
            }
        }
        throw new Exception("Такой заметки не найдено");
    }

    public List<Note> readAllUsers(){
        return repository.getAllNotes();
    }

    public void updateNote(String noteId, Note newNote) throws Exception {
        List<Note> notes = repository.getAllNotes();
        Note note = noteSearch(noteId,notes);
        note.setHeading(newNote.getHeading());
        note.setBody(newNote.getBody());
        repository.saveNote(notes);
    }

    public Note deleteNote(String noteID) throws Exception {
        readNote(noteID);

        return repository.deleteNote(noteID);
    }
}

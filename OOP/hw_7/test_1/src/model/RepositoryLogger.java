package model;

import java.util.List;

public class RepositoryLogger implements Repository {

    private Repository logs;
    private FileOperationAddNewSaveMethod writeEvent;

    public RepositoryLogger(Repository logs, FileOperationAddNewSaveMethod writeEvent){
        this.writeEvent = writeEvent;
        this.logs = logs;
    }
    @Override
    public List<Note> getAllNotes() {
        writeEvent.saveLogFile("Выведены все записки");
        return logs.getAllNotes();
    }

    @Override
    public String createNote(Note user) {
        writeEvent.saveLogFile("Создана новая записка");
        return logs.createNote(user);
    }

    @Override
    public void saveNote(List<Note> users) {
        writeEvent.saveLogFile("Сохранена новая записка");
        logs.saveNote(users);
    }


    @Override
    public void deleteNote(String id) {
        writeEvent.saveLogFile("Удален пользователь: " + id);
        logs.deleteNote(id);
    }
}

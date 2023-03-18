package model;

import java.util.List;

public class RepositoryLogger implements Repository {

    private Repository logs;
    private Logger writeEvent;

    public RepositoryLogger(Repository logs, Logger writeEvent){
        this.writeEvent = writeEvent;
        this.logs = logs;
    }
    @Override
    public List<Note> getAllNotes() {
        writeEvent.saveToLog("Выведены все записки");
        return logs.getAllNotes();
    }

    @Override
    public String createNote(Note user) {
        writeEvent.saveToLog("Создана новая записка");
        return logs.createNote(user);
    }

    @Override
    public void saveNote(List<Note> users) {
        writeEvent.saveToLog("Сохранена новая записка");
        logs.saveNote(users);
    }


    @Override
    public void deleteNote(String id) {
        writeEvent.saveToLog("Удален пользователь: " + id);
        logs.deleteNote(id);
    }
}

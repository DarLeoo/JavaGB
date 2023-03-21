import Logger.Logger;
import controller.Notes;
import controller.NotesContLogger;
import controller.NotesController;
import model.*;
import views.ViewNotes;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger("logger.txt");
        FileOperation fileOperation = (new FileOperations("notes.txt"));
        Repository repository = new RepositoryFile(fileOperation);
        NotesController controller = new NotesController(repository);
        Notes cont = new NotesContLogger(controller, logger);
        ViewNotes view = new ViewNotes(cont);
        view.run();
    }
}
import controller.NotesController;
import model.*;
import views.ViewNotes;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger("logger");
        FileOperation fileOperation = (new FileOperations("notes.txt"));
        Repository repository = new RepositoryFile(fileOperation);
        Repository repository1 = new RepositoryLogger(repository,logger);
        NotesController controller = new NotesController(repository);
        ViewNotes view = new ViewNotes(controller);
        view.run();
    }
}
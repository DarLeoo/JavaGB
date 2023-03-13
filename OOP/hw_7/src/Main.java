import controller.NotesController;
import model.FileOperation;
import model.FileOperations;
import model.Repository;
import model.RepositoryFile;
import views.ViewNotes;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperations("notes.txt");
        Repository repository = new RepositoryFile(fileOperation);
        NotesController controller = new NotesController(repository);
        ViewNotes view = new ViewNotes(controller);
        view.run();
    }
}
package model;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class FileOperationAddNewSaveMethod implements FileOperation {
    private FileOperation fileOperation;

    public FileOperationAddNewSaveMethod(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<String> readAllLines() {
        return fileOperation.readAllLines();
    }

    @Override
    public void saveAllLines(List<String> lines) {
        fileOperation.saveAllLines(lines);
    }
    public void saveLogFile(String event) {
        try (FileWriter writer = new FileWriter("logger", false)) {
            LocalDateTime currentTime = LocalDateTime.now();
                writer.write(String.format("%s %s \n",currentTime,event));
                writer.append('\n');
                writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

package model;

public class NoteMapper {

    public String map(Note note){
        return String.format("%s,%s,%s,%s",note.getId(),note.getHeading(),note.getBody(),note.getDateOfCreate());
    }

    public Note map(String line){
        String[] lines = line.split(",");
        //String separator = "***********";  подумать, как сделать разделитель этих самых заметок
        return new Note(lines[0], lines[1],lines[2]);
    }
}

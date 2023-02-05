package hm_2;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;
public class task_1 {
    public static void WriteLogger(String errors) throws IOException {
        Logger logger = Logger.getLogger(task_1.class.getName());
        FileHandler fh = new FileHandler("log.xml", true);
        logger.addHandler(fh);
        XMLFormatter xmlForm = new XMLFormatter();
        fh.setFormatter(xmlForm);
        logger.log(Level.INFO, errors);
        fh.close();
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Введите число в байтовом формате: ");
        String string_num = "";
        FileWriter fw = new FileWriter("result.txt", true);
        fw.write( string_num + "\n");
        fw.flush();
        fw.close();

        try {
            Scanner scn = new Scanner(System.in);
            byte byte_num = scn.nextByte();
            string_num = Byte.toString(byte_num);
            scn.close();

        } catch (Exception ex) {
            WriteLogger(ex.toString());
        } finally {
            System.out.println("Operation ended");
        }
    }
}





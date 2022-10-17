import java.util.Scanner;
import java.util.Date;
public class Hm_1_1 {
public static void main(String[] args) {
    /*В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
    • "Доброе утро, <Имя>!", если время от 05:00 до 11:59 • "Добрый день, <Имя>!", если время от 12:00 до 17:59; • 
    "Добрый вечер, <Имя>!", если время от 18:00 до 22:59; • "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
     */
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите ваше имя? ");
    String name = iScanner.nextLine();
    System.out.println(name);
    Date date1 = new Date();
    int time = date1.getHours();
    if (time >= 5 & time  < 12) {
        String hi = "Доброе утро "+  name;
        System.out.println(hi);
                   
    }
    else if (time >= 12 & time  < 18) {
        String hi = "Добрый день  "+  name;
        System.out.println(hi);
    }
    else if (time >= 18 & time  < 23) {
        String hi = "Добрый вечер "+  name;
        System.out.println(hi);
    }
    else if (time >= 23 & time  < 24) {
        String hi = "Доброй ночи "+  name;
        System.out.println(hi);
    }
    else if (time >= 0 & time  < 5) {
        String hi = "Доброй ночи "+  name;
        System.out.println(hi);
    }
    
    
    iScanner.close();




    }
}
package hm_1;
public class task_3 {
    public static void main(String[] args) {
        System.out.println("Ниже представлен список простых чисел: ");
        for (int i = 2; i < 101; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0){
                    count ++;
                }
            }
            if (count == 1){
                System.out.print(i + " ");
            }
        }
        }
    }



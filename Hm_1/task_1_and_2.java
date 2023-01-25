package hm_1;

public class task_1_and_2 {
    public static void main(String[] args) {
        int min_arr = 0;
        int max_arr = 300;
        int len_arr = 10;
        int[] arr = new int[len_arr];
        int sum_arr = 0;
        int temp = 0;
        for (int i = 0; i < len_arr; i++) {
            int a = (int)(Math.random() * (max_arr - min_arr + 1) + min_arr);
            arr[i] = a;
        }
        for (int item: arr) {
            sum_arr += item;
        }
        boolean isSort = true;
        while (isSort){
            isSort = false;
            for (int i = 0; i < len_arr - 1; i++) {
                if(arr[i] > arr[i + 1]){
                    isSort = true;

                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                }
        }
        for (int j = 0; j < len_arr; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("Минимальное значение массива: " + arr[0]);
        System.out.println("Максимальное значение массива: " + arr[len_arr - 1]);
        System.out.println("Среднее значение массива: " + sum_arr / len_arr);
    }
}

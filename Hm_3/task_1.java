package hm_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.list;

public class task_1 {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> firs_list = new ArrayList<>(Arrays.asList(-1, 1, 2, 3, 4, 5));
        RemoveEvenValue(firs_list);
        GetMinAndMax(firs_list);
        MiddleValue(firs_list);
    }
    public static void RemoveEvenValue(List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                temp.add(i);
            }
        }
        System.out.println("Произвольный список состощий из четных числе: " + temp);
    }
    public static void GetMinAndMax(List<Integer> list){
        Collections.sort(list);
        int min_num = list.get(0);
        int max_num = list.get(list.size()-1);
        System.out.println("Минимальное значение " + min_num);
        System.out.println("Максимальное значение " + max_num);
    }
    public static void MiddleValue(List<Integer> list){
        int temp = 0;
        for (Integer i : list) {
            temp += i;
        }
        int middle_value = temp / list.size();
        System.out.println("Сренее значение " + middle_value);
    }
}






import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Map<Double, String> phonesBook = Map.of(88001122333D, "Иван Иванов", 88001662333D, "Иван Курицин", 88001112333D,
                "Иван Курицин", 88001122432D, "Иван Незлобин", 88001112453D, "Сергей Потапов", 8800163214D, "Сергей Потапов",
                8800142421D, "Сергей Курицин", 880012343D, "Михаил Незлобин");
        originalMap(phonesBook);
        valueMap(originalMap(phonesBook));
        sortedMap(valueMap(originalMap(phonesBook)));

    }


    public static Map<String, Double> originalMap(Map<Double, String> src) {
        Map<String, Double> newPhonesBook = new HashMap<>();
        for (var item : src.entrySet()) {
            if (!newPhonesBook.containsValue(item.getValue())) {
                newPhonesBook.put(item.getValue(), item.getKey());
            }
        }
        return newPhonesBook;
    }

    public static Map<String, Integer> valueMap(Map<String, Double> src) {
        Map<String, Integer> finalPhoneBook = new HashMap<>();
        for (var item : src.keySet()) {
            String name = item.split(" ")[0];
            if (!finalPhoneBook.containsKey(name)) {
                finalPhoneBook.put(name, 1);
            } else {
                finalPhoneBook.put(name, finalPhoneBook.get(name) + 1);
            }
        }
        return finalPhoneBook;
    }

    public static TreeMap<Integer, String> sortedMap(Map<String,Integer> hashMap) {
        TreeMap <Integer,String> sortedPhonesBook = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, Integer> item: hashMap.entrySet()) {
            sortedPhonesBook.put(item.getValue(),item.getKey());
        }
        for (var item : sortedPhonesBook.keySet()){
            System.out.println(sortedPhonesBook.get(item) + " - " + item);
        }


        return sortedPhonesBook;
    }
    }



































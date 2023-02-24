public class Main {
    public static void main(String[] args) {
        CreatMyLinkedList linkedList = new CreatMyLinkedList();
        linkedList.addFirst("j");
        linkedList.addFirst("a");
        linkedList.addFirst("v");
        linkedList.addFirst("a");
        for (String item: linkedList) {
            System.out.println(item);
        }




    }
}
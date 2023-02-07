import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> Queue = new LinkedList<>();
        enqueue(Queue, 5);
        enqueue(Queue, 7);
        enqueue(Queue, 9);
        enqueue(Queue, 3);
        System.out.println("Заполнение очереди: ");
        System.out.println(Queue);

        System.out.println("Возврат и удаление первого элемента: ");
        System.out.println(dequeue(Queue));
        System.out.println(Queue);

        System.out.println("Возврат первого элемента: ");
        System.out.println(first(Queue));

    } 
    public static void enqueue(LinkedList<Integer> userList, int element) {
        userList.add(element);
    }
    public static int dequeue(LinkedList<Integer> userList) {
        int first = userList.getFirst();
        userList.removeFirst();
        return first;
    }
    public static int first(LinkedList<Integer> userList) {
        return userList.getFirst();
    }
}

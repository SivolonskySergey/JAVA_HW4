import java.util.LinkedList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> userList = new LinkedList<>();
        LinkedList<Integer> resultList = fillList(userList, 10);
        System.out.println("Начальный список: ");
        System.out.println(resultList);
        System.out.println("Перевернутый список: ");
        System.out.println(listReverse(userList));
    }
    public static LinkedList<Integer> fillList(LinkedList<Integer> listToFill, int listSize) {
        Random rnd = new Random();
        for (int i = 0; i < listSize; i++) {
            listToFill.add(rnd.nextInt(50));
        }
        return listToFill;
    }
    private static LinkedList<Integer> listReverse(LinkedList<Integer> listToReverse) {
        for (int i = 1; i < listToReverse.size(); i++) {
            listToReverse.addFirst(listToReverse.remove(i));
        }
        return listToReverse;
    }
}
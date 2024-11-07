import java.util.LinkedList;
public class linkedList {
    public static void main(String[] args) {

        LinkedList <String> list = new LinkedList<>();

        list.add("Arun");
        list.add("getha");
        list.add("raju");
        list.add("setha");
        list.add("ram");

        System.out.println(list);
        System.out.println(list.size());
        System.err.println(list.remove(2));
        list.addFirst("sandy");
        list.addLast("prabha");
        System.out.println(list);
        list.forEach((list1) -> System.out.println(list1));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}

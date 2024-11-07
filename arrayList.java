import java.util.ArrayList;
public class arrayList{
    public static void main(String[] args){

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("kiwi");
        fruits.add("grapes");
        fruits.add("orange");

        System.out.println(fruits);
        System.out.println(+fruits.size());
        System.out.println(fruits.get(0));
        fruits.remove("banana");
        System.out.println(fruits);
        System.out.println(fruits.contains("kiwi")); 
        fruits.forEach(list -> System.out.println(list));
        fruits.clear();
        System.out.println(fruits);
    }
}
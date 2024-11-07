import java.util.HashSet;
public class Set {
    public static void main(String[] args){

        HashSet <Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(30);
        numbers.add(30);
        numbers.add(50);
        numbers.add(3);

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.contains(5));
        numbers.remove(3);
        System.out.println(numbers);
        numbers.forEach(i -> System.out.println(i));
        numbers.clear();
        System.out.println(numbers);
        
    }
}

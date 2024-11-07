import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        HashMap<Integer,String> students = new HashMap<>();

        students.put(83,"ram");
        students.put(29,"kia");
        students.put(13,"raju");
        students.put(90,"krishna");
        students.put(31,"raju");
        

        System.out.println(students);
        System.out.println(students.get(13));
        System.out.println(students.get(3));
        students.remove(2);
        System.out.println(students);
        students.forEach((k,v) -> System.out.println("key: " +k +", values: "+v));
        System.out.println(students.keySet());
        System.out.println(students.values());
        
    }
}

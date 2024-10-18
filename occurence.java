import java.util.Scanner;
public class occurence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element : ");
        int element=sc.nextInt();
        int[] arr={2,3,7,3,1,8,3,4,7,3,6};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                count++;
            }
        }
        System.out.println("Occurence of 3 is : "+count);
    }
}

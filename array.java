public class array {
    public static void main(String[] args){
        int[] arr ={3,6,8,2,4,8,5,9,3,5};
        System.out.println("Numbers with even index : ");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Numbers with odd index : ");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Squares of all elements : ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]*arr[i]);
        }
        int sum=0;
        System.out.println("Elements divisible by 2 : ");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
                sum+=arr[i];
            }  
        }
        System.out.println("Sum of Elements divisible by 2 is : "+ sum);
    }
}
       


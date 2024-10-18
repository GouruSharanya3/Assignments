public class minMax {
    public static void main(String[] args){
        int[] arr={3,6,9,10,45,24,5,8};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element of an array : "+max);
        System.out.println("Minimum element of an array : "+min);
    
    }
}

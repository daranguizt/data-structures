package Arrays;

public class Array {
    static int arr[];
    static String[] arr2;

    //example of insertion, must return new array or shift elements
    static int[] insert(int[] arr, int position, int newElement){
        int newSize = arr.length + 1;
        int auxArr[] = new int[newSize];
        for(int i = 0; i < newSize; i++){
            if(i < position) auxArr[i] = arr[i];
            else if(i == position) auxArr[i] = newElement;
            else auxArr[i] = arr[i - 1];
        }
        return auxArr;
    }

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]){
        arr = new int[]{1,2,3,4,5};
        arr2 = new String[5];

        System.out.println("initial arr");
        printArray(arr);

        System.out.println("after inserting 5 on position 3");
        arr = insert(arr, 3, 5);
        printArray(arr);

    }
}

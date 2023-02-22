import java.util.Scanner;

public class getData {
    public static int[] getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the size of array");
        int size = sc.nextInt();
        System.out.println("enter the elements in your array:");
        int[] arr= new int[size];
        for(int i=0; i<size; i++){
            System.out.println("enter "+(i+1)+" element:");
            arr[i] = sc.nextInt();
        }
        System.out.println("numbers are");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " " );
        }
        return arr;
    }
}


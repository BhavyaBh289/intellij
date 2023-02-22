import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        System.out.println("enter the elements in your array:");

        for(int i=0; i<size; i++){
            for (int j=0;j<size;j++){
                System.out.println("enter "+(i+1)+", "+(j+1)+" element:");
                arr[i][j] = sc.nextInt();
            }
        }
        
    }
}
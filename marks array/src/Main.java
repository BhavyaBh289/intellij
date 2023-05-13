import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        int i = 0;
        while (i<num){
            arr[i] = sc.nextInt();
            i++;
        }
        i = 0;
        int sum = 0;
        while (i<num){
            sum+=arr[i];
            i++;
        }
        System.out.println(sum/num);
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String args[]) {
        int arr[] = getData.getData();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the addition of two numbers");

        int targetsum = sc.nextInt();
        int res[][] = numsum.numsum(targetsum, arr);
        System.out.println("The pairs are");

        if(res[0][0]!=0){
            for (int[]i:res) {
                if (i[0]!=0){
                    System.out.println(Arrays.toString(i));
                }
            }
        }else{
            System.out.println("[]");
        }
    }
}
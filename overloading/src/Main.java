import java.util.Arrays;
import java.util.Scanner;
 class overloading {
    int[] data;
    int targetsum;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] data = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++){
            data[i] = sc.nextInt();
        }
        System.out.println("Enter the targetsum: ");
        int targetsum = sc.nextInt();
        this.data= data;
        this.targetsum = targetsum;
    }
    int[] numsum() {
        int[] data = this.data;

        int[] result = new int[2];
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] + data[j] == this.targetsum) {
                    result[0] = data[i];
                    result[1] = data[j];
                    return result;
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        overloading data = new overloading();
        data.getdata();
        int[] result = data.numsum();
        if (result.length == 0) {
            System.out.println("No two numbers sum up to the target sum");
        } else {
            System.out.println("Resulting two elements: " + Arrays.toString(result));
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static int findval(int[] n, int m)throws ArrayIndexOutOfBoundsException{
        return n[m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =0;
        while (t !=4){
            System.out.print("enter 1 for division  \nenter 2 for array \nenter 3 for string ");
            t = sc.nextInt();
            switch (t){
                case 1:
                    System.out.print("enter devisor ");
                    int div = sc.nextInt();
                    System.out.print("enter divident ");
                    int di = sc.nextInt();
                    try{
                        if (di ==0){
                            throw  new ArithmeticException();
                        }
                        int ans=div/di;
                        System.out.println("answer is "+ans);
                    }catch (ArithmeticException ae){
                        System.out.println("You shouldn’t divide a number by zero.");
                    }
                    break;
                case 2 :
                    System.out.println("enter size of array ");
                    int num = sc.nextInt();
                    System.out.println("value to fetch ");
                    int nu = sc.nextInt();
                    int[] arr = new int[num];
                    try {
                        int i = findval(arr,nu);
                        System.out.println("number is "+ i);
                    }catch(ArrayIndexOutOfBoundsException ex){
                        System.out.println("OOPs!!!Array Index "+nu+" out of bounds for length "+num+".\n");
                    }
                    break;
                case 3:
                    String s = null;
                    try {
                        int n = s.length();
                    }catch(NullPointerException npe){
                        System.out.println("Null Pointer Exception arises!!");
                    }break;
                case 4:
                    System.out.println("exiting");
                    break;
            }
        }
    }
}
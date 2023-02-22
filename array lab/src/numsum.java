public class numsum {
    public static int[][] numsum(int sum,int[] arr){
        int i = arr.length - 1;
        int n=0;
        int arrs[][]=new int[i][];
        for(i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == sum && arr[i]!=arr[j]){
                    arrs[n]=new int[]{arr[i],arr[j]};
                    n+=1;
                }
            }
        }
        i = arr.length - 1;
        while (n<+i){
            arrs[n]=new int[]{0,0};
            n+=1;
        }
        return arrs;
    }
}

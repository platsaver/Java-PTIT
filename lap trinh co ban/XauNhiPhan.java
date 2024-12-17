import java.util.Scanner;

public class XauNhiPhan {
    public static int res(long array[], int n, long k){
        if (n==1) return 0; 
        if (n==2) return 1;
        if (k<=array[n-2]) return res(array,n-2,k);
        return res(array,n-1,k-array[n-2]);
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int t = object.nextInt();
        while (t-->0){
            int n = object.nextInt();
            long k = object.nextLong();
            long array[] = new long[93];
            array[0] = 0; 
            array[1] = 1;
            for (int i=2; i<93; i++){
                array[i] = array[i-1]+array[i-2];
            }
            System.out.println(res(array,n,k));
        }
        object.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class DayConCoKPhanTuTangDan {
    static int n,k;
    public static void Try(int start, int cnt, int k, int array[], String s){
        if (cnt==k){
            System.out.println(s);
        }
        for (int i=start; i<array.length; i++){
            Try(i+1,cnt+1,k,array,s+array[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int t = object.nextInt();
        while (t-->0){
            n = object.nextInt();
            k = object.nextInt();
            int array[] = new int[n];
            for (int i=0; i<n; i++){
                array[i] = object.nextInt();
            }
            Arrays.sort(array);
            Try(0,0,k,array,"");
        }
    }
}

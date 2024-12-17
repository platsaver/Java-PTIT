import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DayConCoTongNguyenTo {
    static int n; 
    static ArrayList<String> a; 
    public static boolean prime(int n){
        if (n<=1){
            return false; 
        }
        else if (n==2){
            return true; 
        }
        else{
            for (int i=2; i<=Math.sqrt(n)+1; i++){
                if (n%i==0){
                    return false; 
                }
            }
            return true; 
        }
    }
    public static void Try(int end, int sum, int array[], String s){
        if(prime(sum)){
            System.out.println(s); 
            a.add(s);
        }
        for (int i=array.length-1; i>end; i--){
            Try(i,sum+array[i],array,s+array[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int t = object.nextInt();
        while (t-->0){
            n = object.nextInt();
            a = new ArrayList<>();
            int array[] = new int[n];
            for (int i=0; i<n; i++){
                array[i] = object.nextInt();
            }
            for (int i=0; i<n-1; i++){
                for (int j=i+1; j<n; j++){
                    if (array[i]<array[j]){
                        int temp = array[i]; 
                        array[i] = array[j]; 
                        array[j] = temp;
                    }
                }
            }
            Try(-1,0,array,"");
            Collections.sort(a);
        }
        object.close();
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DayConCoTongLe {
    static ArrayList<String> ans; 
    public static void Try(int end, int sum, int array[], String s){
        if (sum%2!=0){
            System.out.println(s);
            ans.add(s);
        }
        for (int i=array.length-1; i>end; i--){
            Try(i,sum+array[i],array,s+array[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        int t = object.nextInt();
        while (t-->0){
            int n = object.nextInt();
            int array[] = new int[n];
            for (int i=0; i<n; i++){
                array[i] = object.nextInt();
            }
            ans = new ArrayList<>();
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
            Collections.sort(ans);
        }
        object.close();
    }
}

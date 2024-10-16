import java.util.Scanner; 

public class mang_doi_xung {
    private static boolean reversible(long array[], int n){
        for (int i=0; i<n; i++){
            if (array[i] != array[n-i-1]){
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        long array[] = new long[1000001]; 
        while (t-->0){
            int n = object.nextInt(); 
            for (int i=0; i<n; i++){
                array[i] = object.nextInt(); 
            }
            if (reversible(array,n)){
                System.out.println("YES"); 
            }
            else{
                System.out.println("NO"); 
            }
        }
        object.close(); 
    }
}

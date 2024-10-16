import java.util.Scanner; 

public class sap_xep_noi_bot {
    private static void output(int array[],int n, int step){
        System.out.printf("Buoc %d: ", step); 
        for (int i=0; i<n; i++){
            System.out.printf("%d ", array[i]); 
        }
        System.out.println(""); 
    }
    private static boolean isSorted(int array[], int n){
        for (int i=0; i<n-1; i++){
            if (array[i]>array[i+1]){
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int n = object.nextInt(); 
        int array[] = new int[100]; 
        for (int i=0; i<n; i++){
            array[i] = object.nextInt(); 
        }
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1; j++){
                if (array[j]>array[j+1]){
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                }
            }
            output(array,n,i+1); 
            if (isSorted(array, n)){
                break; 
            }
        }
        object.close(); 
    }
}

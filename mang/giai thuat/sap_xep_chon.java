import java.util.Scanner; 
// Selection sort
public class sap_xep_chon {
    public static void output(int array[], int n, int step){
        System.out.printf("Buoc %d: ", step); 
        for (int i=0; i<n; i++){
            System.out.printf("%d ", array[i]); 
        }
        System.out.println(""); 
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int n = object.nextInt();
        int array[] = new int[100];  
        for (int i=0; i<n; i++){
            array[i] = object.nextInt(); 
        }
        for (int i=0; i<n-1; i++){
            int starting_point = i; 
            for (int j=i+1; j<n; j++){
                if (array[starting_point]>array[j]){
                    starting_point=j; 
                }
            }
            int temp = array[i]; 
            array[i] = array[starting_point]; 
            array[starting_point] = temp; 
            output(array,n,i+1); 
        }
        object.close(); 
    }
}

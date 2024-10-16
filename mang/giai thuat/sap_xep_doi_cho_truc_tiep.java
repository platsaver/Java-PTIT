import java.util.Scanner; 
//Interchange Sort
public class sap_xep_doi_cho_truc_tiep {
    public static void output(int array[], int n, int step){
        System.out.printf("Buoc %d: ", step); 
        for (int i=0; i<n; i++){
            System.out.printf("%d ", array[i]); 
        }
        System.out.println(" "); 
    }
    public static void main(String[] args){
        Scanner object = new Scanner (System.in); 
        int n = object.nextInt();
        int array[] = new int[100];  
        for (int i=0; i<n; i++){
            array[i] = object.nextInt(); 
        }
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (array[i]>array[j]){
                    int temp = array[i]; 
                    array[i] = array[j]; 
                    array[j] = temp; 
                }
            }
            output(array,n,i+1); 
        }
        object.close(); 
    }
}

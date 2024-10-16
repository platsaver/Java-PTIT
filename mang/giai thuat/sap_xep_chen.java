import java.util.Scanner; 
//Insertion Sort
public class sap_xep_chen{
    private static void output(int array[], int step) {
        System.out.printf("Buoc %d: ", step);
        for (int i = 0; i <= step; i++) { // In ra các phần tử đã sắp xếp
            System.out.printf("%d ", array[i]);
        }
        System.out.println(""); // Xuống dòng sau khi in
    }
    private static void InsertionSort(int array[], int n){
        for (int i=0; i<n; i++){
            int key = array[i]; 
            int j = i-1; 
            while (j>=0 && key<array[j]){
                array[j+1] = array[j]; 
                j--;  
            }
            array[j+1] = key;
            output(array,i); 
        }
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int n = object.nextInt();
        int array[] = new int[100]; 
        for (int i=0; i<n; i++){
            array[i] = object.nextInt();
        }
        InsertionSort(array, n);
        object.close(); 
    }
}
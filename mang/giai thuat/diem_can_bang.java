import java.util.Scanner; 

public class diem_can_bang{
    public static int Equilibrium_Index(int array[], int n){
        int total_sum=0; 
        int left_sum=0;  
        for (int i=0; i<n; i++){
            total_sum+=array[i]; 
        }
        for (int i=0; i<n; i++){ 
            int right_sum=total_sum-left_sum-array[i];
            if (left_sum==right_sum){
                return i+1; 
            } 
            left_sum+=array[i]; 
        }
        return -1; 
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        int array[] = new int[100001]; 
        while (t-->0){
            int n = object.nextInt(); 
            for (int i=0; i<n; i++){
                array[i] = object.nextInt(); 
            }
            System.out.println(Equilibrium_Index(array, n));
        }
        object.close(); 
    }
}
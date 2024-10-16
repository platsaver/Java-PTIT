import java.util.Scanner; 

public class TinhSoFibonacci {
    public static long fibonacci(int n){
        long array[] = new long [n];  
        array[0] = 1; 
        array[1] = 1; 
        for (int i=2; i<n; i++){
            array[i] = array[i-1] + array[i-2]; 
        }
        return array[n-1]; 
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        while(t-->0){
            int n = object.nextInt();
            System.out.println(fibonacci(n)); 
        }
        object.close();
    }
}

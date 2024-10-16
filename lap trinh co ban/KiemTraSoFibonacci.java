import java.util.Scanner; 

public class KiemTraSoFibonacci{
    public static boolean prime_check(long array[], long n){
        for (int i=0; i<93; i++){
            if (array[i]==n){
                return true; 
            }
        }
        return false; 
    }
    public static void  main(String[] args){
        Scanner object = new Scanner(System.in);
        long array[] = new long [93]; 
        array[0] = 0; 
        array[1] = 1; 
        for (int i=2; i<93; i++){
            array[i] = array[i-1] + array[i-2]; 
        }
        int t = object.nextInt();
        while (t-->0){
            long n = object.nextLong(); 
            if (prime_check(array,n)){
                System.out.println("YES"); 
            }
            else{
                System.out.println("NO"); 
            }
        }
        object.close(); 
    }
}
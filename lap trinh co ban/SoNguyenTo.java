import java.util.Scanner; 

public class SoNguyenTo {
    public static boolean prime_check(int n){
        if (n<=1){
            return false; 
        }
        else{
            for (int i=2; i<=(Math.sqrt(n))+1; i++){
                if (n%i==0){
                    return false; 
                }
            }
            return true; 
        }
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt(); 
        while (t-->0){
            int n = object.nextInt(); 
            if (prime_check(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO"); 
            }
        }
        object.close();
    }
}

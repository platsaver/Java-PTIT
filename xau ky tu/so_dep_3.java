import java.util.*; 

public class so_dep_3 {
    public static boolean isReversible(String n){
        for (int i=0; i<n.length(); i++){
            if (n.charAt(i)!=n.charAt(n.length()-i-1)){
                return false; 
            }
        }
        return true; 
    }
    public static boolean isPrime(int n){
        if (n<=1){
            return false; 
        } 
        if (n==2){
            return true; 
        }
        else{
            for (int i=2; i<=Math.sqrt(n)+1; i++){
                if (n%i==0){
                    return false; 
                }
            }
            return true; 
        }
    }
    public static boolean isPrimeAll(String n){
        for (char c: n.toCharArray()){
            int digit = c-'0'; 
            if (!isPrime(digit)){
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args){
        Scanner object = new Scanner(System.in); 
        int t = object.nextInt();
        object.nextLine(); 
        while (t-->0){
            String n = object.nextLine(); 
            if (isReversible(n) && isPrimeAll(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO"); 
            }
        }
        object.close(); 
    }
}
